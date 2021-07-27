package com.william.zup.transacao.consumer;

import com.william.zup.transacao.consumer.DTO.TransacaoDTO;
import com.william.zup.transacao.api.Transacao;
import com.william.zup.transacao.api.TransacaoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class ConsumerTransacoes {

@Autowired
    private TransacaoRepository repository;


    private static final Logger log = LoggerFactory.getLogger(ConsumerTransacoes.class);


    @Value("${topic.name.consumer.transacoes}")
    private String topicName;

    @KafkaListener(topics = "${topic.name.consumer.transacoes}")
    @Transactional
    public void consume(@Payload TransacaoDTO transacao) {


        log.info("Tópico: {}\n", topicName);

        log.info("Transacao: {}\n", transacao);
        Transacao order = transacao.toModel();

        repository.save(order);
        log.info("Transação salva no banco: {}\n", order );


    }
}
