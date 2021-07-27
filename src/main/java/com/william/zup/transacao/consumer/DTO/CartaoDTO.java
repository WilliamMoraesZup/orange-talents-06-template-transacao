package com.william.zup.transacao.consumer.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.william.zup.transacao.api.Cartao;

public class CartaoDTO {

    @JsonProperty("id")
    private String id;

    @JsonProperty("email")
    private String email;

    public CartaoDTO() {
    }

    @Override
    public String toString() {
        return "CartaoDTO{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Cartao toModel() {
        return new Cartao(id, email);
    }

}
