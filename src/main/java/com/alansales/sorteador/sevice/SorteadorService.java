package com.alansales.sorteador.sevice;

import com.alansales.sorteador.exception.NumeroForaDoLimiteException;
import com.fasterxml.jackson.databind.util.BeanUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class SorteadorService {

    public List<Integer> sortear0a99(int quantidade){
        if (validarNumero0a99(quantidade)) {
            List<Integer> lista = new ArrayList<>();
            Random gerador = new Random();

            int i = 0;
            while (i<quantidade){
                int numero = gerador.nextInt(100);
                if (!lista.contains(numero)) {
                    lista.add(numero);
                    i++;
                }
            }

            return lista;
        }else {
            throw new NumeroForaDoLimiteException(quantidade + " é um número fora do Limte suportado. " +
                    "Use um número de 1 a 100.");
        }
    }

    public List<Integer> sortear1a60(int quantidade){
        if (validarNumero1a60(quantidade)) {
            List<Integer> lista = new ArrayList<>();
            Random gerador = new Random();

            int i = 0;
            while (i<quantidade){
                int numero = gerador.nextInt(1,61);
                if (!lista.contains(numero)) {
                    lista.add(numero);
                    i++;
                }
            }

            return lista;
        }else {
            throw new NumeroForaDoLimiteException(quantidade + " é um número fora do Limte suportado. " +
                    "Use um número de 1 a 60.");
        }
    }

    public List<Integer> sortearMilhar(int quantidade){
        if (validarNumeroMilhar(quantidade)) {
            List<Integer> lista = new ArrayList<>();
            Random gerador = new Random();

            int i = 0;
            while (i<quantidade){
                int numero = gerador.nextInt(10000);
                if (!lista.contains(numero)) {
                    lista.add(numero);
                    i++;
                }
            }

            return lista;
        }else {
            throw new NumeroForaDoLimiteException(quantidade + " é um número fora do Limte suportado. " +
                    "Use um número de 1 a 10.");
        }
    }

    private boolean validarNumero0a99(int quantidade){
        return quantidade > 0 && quantidade <= 100;
    }

    private boolean validarNumero1a60(int quantidade){
        return quantidade >= 1 && quantidade <= 60;
    }

    private boolean validarNumeroMilhar(int quantidade){
        return quantidade >= 1 && quantidade <= 10;
    }
}
