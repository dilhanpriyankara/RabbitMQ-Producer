package com.producer.demo.producer.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateDataController {
    /*
     * @Autowired private RabbitMQProducer rabbitMQProducer;
     * 
     * @Value("${createData.exchange.name}") private String exchange;
     * 
     * @Value("${createData.routing.key}") private String routingKey;
     * 
     * @PostMapping("/createData") public String publishMessage(@RequestParam("message") String message) {
     * 
     * rabbitMQProducer.sendMessage(exchange, routingKey, message); return "Message was sent successfully"; }
     */
}
