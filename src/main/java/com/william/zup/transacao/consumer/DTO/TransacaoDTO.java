package com.william.zup.transacao.consumer.DTO;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.william.zup.transacao.api.Transacao;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransacaoDTO {


    @JsonProperty("id")
    private String id;

    @JsonProperty("valor")
    private BigDecimal valor;

    @JsonProperty("estabelecimento")
    private EstabelecimentoDTO estabelecimento;
    @JsonProperty("cartao")
    private CartaoDTO cartao;
    @JsonProperty("efetivadaEm")
    private LocalDateTime efetivadaEm;

    public TransacaoDTO() {
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "id='" + id + '\'' +
                ", valor='" + valor + '\'' +
                ", estabelcimentoDTO=" + estabelecimento +
                ", cartao=" + cartao +
                ", efetivadaEm='" + efetivadaEm + '\'' +
                '}';
    }

    public Transacao toModel() {

        return new Transacao(id, valor, estabelecimento.toModel(), cartao.toModel(), efetivadaEm);

    }
}
