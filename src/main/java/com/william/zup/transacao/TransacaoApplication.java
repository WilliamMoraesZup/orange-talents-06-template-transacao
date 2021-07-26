package com.william.zup.transacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication @EnableKafka
public class TransacaoApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(TransacaoApplication.class, args);

    }
}