package com.william.zup.transacao.api;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //  "id":"fbaccbca-baa8-4c9b-91b0-b5d177772d77","valor":2.8836429817905445,"estabelecimento":{"nome":"Mike Raffone","cidade":"Lake Debby","endereco":"Suite 025 347 Miller Isle, Port Nolan, UT 77728"},"cartao":{"id":"b0012b90-42c8-40e6-903d-64acb3aa649b","email":"luram.scs@  aas.com.br"},"efetivadaEm":"2021-07-12T05:58:12"}

    private String valor;
    private String estabelecimento;

    public Transacao(String valor, String estabelecimento) {
        this.valor = valor;
        this.estabelecimento = estabelecimento;
    }

    public Long getId() {
        return id;
    }

    public String getValor() {
        return valor;
    }

    public String getEstabelecimento() {
        return estabelecimento;
    }

    @Override
    public String toString() {
        return "Transacao{" +
                "id=" + id +
                ", valor='" + valor + '\'' +
                ", estabelecimento='" + estabelecimento + '\'' +
                '}';
    }
}
