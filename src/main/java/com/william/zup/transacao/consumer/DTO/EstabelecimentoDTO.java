package com.william.zup.transacao.consumer.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.william.zup.transacao.api.Estabelecimento;

public class EstabelecimentoDTO {


    @JsonProperty("nome")
    private String nome;

    @JsonProperty("cidade")
    private String cidade;

    @JsonProperty("endereco")
    private String endereco;

    public EstabelecimentoDTO() {
    }

    @Override
    public String toString() {
        return "EstabelcimentoDTO{" +
                "nome='" + nome + '\'' +
                ", cidade='" + cidade + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }

    public Estabelecimento toModel() {
        return new Estabelecimento(nome, cidade, endereco);
    }
}
