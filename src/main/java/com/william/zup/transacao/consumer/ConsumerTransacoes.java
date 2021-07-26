package com.william.zup.transacao.consumer;

import com.william.zup.transacao.api.Transacao;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerTransacoes {

    private static final Logger log = LoggerFactory.getLogger(ConsumerTransacoes.class);


    @Value("${topic.name.consumer.transacoes}")
    private String topicName;

    @KafkaListener(topics = "${topic.name.consumer.transacoes}", groupId = "group_id")
    public void consume(Transacao consumerRecord) {


        log.info("Tópico: {}\n", topicName);

        //log.info("Headers: {}\n", payload.headers());
        // log.info("Partion: {}\n", payload.partition());
     //   log.info("key: {}\n", payload.key().indexOf("valor"));
        log.info("Order: {}\n", consumerRecord );

 System.out.println(consumerRecord  );


    }
}
