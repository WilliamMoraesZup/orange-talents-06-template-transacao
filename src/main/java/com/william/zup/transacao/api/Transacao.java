package com.william.zup.transacao.api;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
public class Transacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotBlank
    private String numeroTransacao;

    @NotNull
    private BigDecimal valor;


    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private Estabelecimento estabelecimento;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private Cartao cartao;


    @NotNull

    private LocalDateTime efetivadoEm;

    public Transacao() {
    }

    public Transacao(String numeroTransacao, BigDecimal valor, Estabelecimento estabelecimento, Cartao cartao, LocalDateTime efetivadoEm) {
        this.numeroTransacao = numeroTransacao;
        this.valor = valor;
        this.estabelecimento = estabelecimento;
        this.cartao = cartao;
        this.efetivadoEm = efetivadoEm;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public LocalDateTime getEfetivadoEm() {
        return efetivadoEm;
    }
}
