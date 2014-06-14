package com.initmax.exchange;

import org.springframework.amqp.core.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Producer {


    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        AmqpTemplate amqpTemplate = context.getBean(AmqpTemplate.class);
        for (int i = 0; i < 10; i++) {
            amqpTemplate.convertAndSend(Config.EXCHANGE_NAME, Config.ROUTING_KEY1, "hello from exchange, my routing key = " + Config.ROUTING_KEY1);
        }
        System.out.println("Done");
    }

}
