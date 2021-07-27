package com.william.zup.transacao.api;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Cartao {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String idCartao;

    @NotBlank
    private String email;

    public Cartao(String idCartao, String email) {

        this.idCartao = idCartao;
        this.email = email;
    }

    public Cartao() {
    }

    public String getIdCartao() {
        return idCartao;
    }

    public String getEmail() {
        return email;
    }
}

