package com.razu.rabbitmq.practice.RabbitMQ;

import java.io.Serializable;

public class Notification implements Serializable {

    private String notificationType;
    private String msg;

}
