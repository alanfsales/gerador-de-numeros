package com.alansales.sorteador.controller;

import com.alansales.sorteador.exception.NumeroForaDoLimiteException;
import com.alansales.sorteador.sevice.SorteadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SorteadorController implements SorteadorControllerSpringDoc {

    @Autowired
    private SorteadorService sorteadorService;

    @GetMapping("/sortear0a99/{quantidade}")
    public List<Integer> sortear0a99(@PathVariable int quantidade){
       return sorteadorService.sortear0a99(quantidade);
    }

    @GetMapping("/sortear1a60/{quantidade}")
    public List<Integer> sortear1a60(@PathVariable int quantidade){
        return sorteadorService.sortear1a60(quantidade);
    }


}
