package com.alansales.sorteador.exception;

public class NumeroForaDoLimiteException extends RuntimeException {

    public NumeroForaDoLimiteException(String mensagem){
        super(mensagem);
    }

    public NumeroForaDoLimiteException(String mensagem, Throwable causa){
        super(mensagem, causa);
    }
}
