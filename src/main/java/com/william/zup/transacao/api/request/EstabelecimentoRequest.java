package com.william.zup.transacao.api.request;

import com.william.zup.transacao.api.Transacao;

public class EstabelecimentoRequest {


    private String nome;

    private String cidade;

    private String endereco;


    public EstabelecimentoRequest(Transacao transacao) {
        this.nome = transacao.getEstabelecimento().getNome();
        this.cidade = transacao.getEstabelecimento().getCidade();
        this.endereco = transacao.getEstabelecimento().getEndereco();
    }

    @Override
    public String toString() {
        return "EstabelecimentoRequest{" +
                "nome='" + nome + '\'' +
                ", cidade='" + cidade + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEndereco() {
        return endereco;
    }
}
