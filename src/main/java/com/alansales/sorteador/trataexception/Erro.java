package com.alansales.sorteador.trataexception;

import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;

@Schema(name = "Erro")
public class Erro {

    @Schema(example = "2023-10-16T22:57:25.3763158")
    private LocalDateTime dataHora;

    @Schema(example = "Recurso não encontrado")
    private String mensagem;

    public Erro(LocalDateTime dataHora, String mensagem) {
        this.dataHora = dataHora;
        this.mensagem = mensagem;
    }

    public Erro(LocalDateTime dataHora, String mensagem, Integer status) {
        this.dataHora = dataHora;
        this.mensagem = mensagem;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }


}
