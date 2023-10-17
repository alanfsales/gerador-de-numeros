package com.alansales.sorteador.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@Tag(name = "Sorteador")
public interface SorteadorControllerSpringDoc {

    @Operation(summary = "Gera números aleatórios de 0 a 99", responses = {
            @ApiResponse(responseCode = "200"),
            @ApiResponse(responseCode = "400", description = "Parametro inválido",
                content = @Content(schema = @Schema(ref = "Erro")))
    })
    List<Integer> sortear0a99(
            @Parameter(description = "Quantidade de números a serem gerados. de 1 a 100 ",
                    example = "5", required = true)
            int quantidade);

    @Operation(summary = "Gera números aleatórios de 1 a 60", responses = {
            @ApiResponse(responseCode = "200"),
            @ApiResponse(responseCode = "400", description = "Parametro inválido",
                    content = @Content(schema = @Schema(ref = "Erro")))
    })
    List<Integer> sortear1a60(
            @Parameter(description = "Quantidade de números a serem gerados. de 1 a 60 ",
                    example = "6", required = true)
            int quantidade);

    @Operation(summary = "Gera números aleatórios de 0000 a 9999", responses = {
            @ApiResponse(responseCode = "200"),
            @ApiResponse(responseCode = "400", description = "Parametro inválido",
                    content = @Content(schema = @Schema(ref = "Erro")))
    })
    List<Integer> sortearMilhar(
            @Parameter(description = "Quantidade de números a serem gerados. de 1 a 10 ",
                    example = "10", required = true)
            int quantidade);
}
