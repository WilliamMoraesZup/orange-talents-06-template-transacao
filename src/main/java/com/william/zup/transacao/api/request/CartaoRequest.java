package com.william.zup.transacao.api.request;

import com.william.zup.transacao.api.Transacao;

public class CartaoRequest {




    private String email;

    public CartaoRequest(Transacao transacao) {

        this.email = transacao.getCartao().getEmail();
    }

    @Override
    public String toString() {
        return "CartaoRequest{" +

                ", email='" + email + '\'' +
                '}';
    }



    public String getEmail() {
        return email;
    }
}
