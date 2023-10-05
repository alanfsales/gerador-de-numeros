package com.alansales.sorteador.trataexception;

import com.alansales.sorteador.exception.NumeroForaDoLimiteException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class TrataExceprions{

    @ExceptionHandler(NumeroForaDoLimiteException.class)
    public ResponseEntity<?> tratarNumeroForaDoLimiteException(NumeroForaDoLimiteException e){
        Erro erro = new Erro(LocalDateTime.now(), e.getMessage());

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(erro);
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<?> trataMethodArgumentTypeMismatchException(){
        Erro erro = new Erro(LocalDateTime.now(), "Parametro inválido. Use um número de 1 a 100");

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(erro);
    }
}
