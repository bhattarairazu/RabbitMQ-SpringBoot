package com.razu.rabbitmq.practice.RabbitMQ.Config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RabbitMqSubscriber {
    private static final Logger log = LoggerFactory.getLogger(RabbitMqSubscriber.class);

    @Autowired
    Queue queue;

    @RabbitListener(queues = "${rabbitmq.queue}")
    public void receive(final String message){
        log.info("Listeneing from queue");
        log.info("Recevied "+message+" form queue");
    }

}
