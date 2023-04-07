package com.producer.demo.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.producer.demo.producer.producer.RabbitMQProducer;

@RestController
public class MessageController {
    @Autowired
    private RabbitMQProducer rabbitMQProducer;

    @Value("${rabbitmq.exchange.name}")
    private String exchange;

    @Value("${rabbitmq.routing.key}")
    private String routingKey;

    @PostMapping("/postMessage")
    public String publishMessage(@RequestParam("message") String message) {

        rabbitMQProducer.sendMessage(exchange, routingKey, message);
        return "Message was sent successfully";
    }
}
