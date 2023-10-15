package com.alansales.sorteador.trataexception;

import java.time.LocalDateTime;

public class Erro {

    private LocalDateTime dataHora;
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
