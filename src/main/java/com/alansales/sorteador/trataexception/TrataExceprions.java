package com.alansales.sorteador.trataexception;

import com.alansales.sorteador.exception.NumeroForaDoLimiteException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class TrataExceprions extends ResponseEntityExceptionHandler{

    @ExceptionHandler(NumeroForaDoLimiteException.class)
    public ResponseEntity<?> tratarNumeroForaDoLimiteException(
            NumeroForaDoLimiteException ex, WebRequest request){

        return handleExceptionInternal(ex, ex.getMessage(), new HttpHeaders(),
                HttpStatus.BAD_REQUEST, request);
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<?> trataMethodArgumentTypeMismatchException(
            MethodArgumentTypeMismatchException ex, WebRequest request){

        String mensagem = "Parametro inválido. Use um numero de 1 a 100.";

        return handleExceptionInternal(ex, mensagem, new HttpHeaders(),
                HttpStatus.BAD_REQUEST, request);
    }

    @Override
    protected ResponseEntity<Object> handleExceptionInternal(Exception ex, Object body,
                     HttpHeaders headers, HttpStatusCode statusCode, WebRequest request) {
        if (body == null) {
            body = new Erro(LocalDateTime.now(), ex.getMessage());
        } else if (body instanceof  String) {
            body = new Erro(LocalDateTime.now(), body.toString());
        }

        return super.handleExceptionInternal(ex, body, headers, statusCode, request);
    }
}
