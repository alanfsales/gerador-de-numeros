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

    public List<Integer> sortear(int quantidade){
        if (validarNumero(quantidade)) {
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
            throw new NumeroForaDoLimiteException("Número fora do Limte. Use um número de 1 a 100.");
        }
    }

    private boolean validarNumero(int quantidade){
        return quantidade > 0 && quantidade <= 100;
    }
}
