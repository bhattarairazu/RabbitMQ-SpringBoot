package com.razu.rabbitmq.practice.RabbitMQ.Config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RabbitMqPublisher {

    private static final Logger logger = LoggerFactory.getLogger(RabbitMqPublisher.class);

    @Autowired
    RabbitTemplate rabbitTemplate;

    @Autowired
    Binding binding;

    @GetMapping("/send/{msg}")
    @ResponseStatus(code = HttpStatus.OK)
    public String send(@PathVariable("msg") String msg){
        logger.info("Sending message tot he queue");
        rabbitTemplate.convertAndSend(binding.getExchange(), binding.getRoutingKey(), msg);
        logger.info("Sending message sucesfully");
        return "Message sent successfully tot he queue";
    }
}
