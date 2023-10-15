package com.alansales.sorteador.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@Tag(name = "Sorteador")
public interface SorteadorControllerSpringDoc {

    @Operation(summary = "Gera números aleatórios de 0 a 99")
    List<Integer> sortear0a99(
            @Parameter(description = "Quantidade de números a serem gerados. de 1 a 100 ",
                    example = "5", required = true)
            int quantidade);

    @Operation(summary = "Gera números aleatórios de 1 a 60")
    List<Integer> sortear1a60(
            @Parameter(description = "Quantidade de números a serem gerados. de 1 a 60 ",
                    example = "6", required = true)
            int quantidade);
}
