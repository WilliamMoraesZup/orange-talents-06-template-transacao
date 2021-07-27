package com.william.zup.transacao.api.request;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.william.zup.transacao.api.Transacao;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@JsonDeserialize
public class TransacaoRequest {

    private BigDecimal valor;

    private EstabelecimentoRequest estabelecimento;

    private CartaoRequest cartao;

    private LocalDateTime efetivadaEm;

    public TransacaoRequest(Transacao transacao) {

        this.valor = transacao.getValor();
        this.estabelecimento = new EstabelecimentoRequest(transacao);
        this.cartao = new CartaoRequest(transacao);
        this.efetivadaEm = transacao.getEfetivadoEm();
    }

    @Override
    public String toString() {
        return "Ultimas transações{" +
                "valor=" + valor +
                ", estabelecimento=" + estabelecimento +
                ", cartao=" + cartao +
                ", efetivadaEm=" + efetivadaEm +
                "\n\n";
    }

    public BigDecimal getValor() {
        return valor;
    }

    public EstabelecimentoRequest getEstabelecimento() {
        return estabelecimento;
    }

    public CartaoRequest getCartao() {
        return cartao;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }
}
