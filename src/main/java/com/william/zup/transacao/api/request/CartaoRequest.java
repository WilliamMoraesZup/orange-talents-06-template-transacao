package com.william.zup.transacao.api.request;

import com.william.zup.transacao.api.Transacao;

public class CartaoRequest {


    private String idCartao;

    private String email;

    public CartaoRequest(Transacao transacao) {
        this.idCartao = transacao.getCartao().getIdCartao();
        this.email = transacao.getCartao().getEmail();
    }

    @Override
    public String toString() {
        return "CartaoRequest{" +
                "idCartao='" + idCartao + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getIdCartao() {
        return idCartao;
    }

    public String getEmail() {
        return email;
    }
}
