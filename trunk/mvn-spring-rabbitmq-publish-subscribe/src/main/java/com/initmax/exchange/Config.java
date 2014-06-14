package com.initmax.exchange;

import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class Config {

    public static final String queue = "queue1";
    public static final String EXCHANGE_NAME = "directEXCHANGE";
    public static final String EXCHANGE_TYPE = "topic";
    public static final String ROUTING_KEY1 = "live.test";
    public static final String HOST = "localhost";
    public static final String LOGIN = "guest";
    public static final String PASS = "guest";

    @Bean
    public ConnectionFactory connectionFactory() {
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory(HOST);
        connectionFactory.setUsername(LOGIN);
        connectionFactory.setPassword(PASS);
        return connectionFactory;
    }

    @Bean
    Queue queue() {
        return new Queue(queue, false, true, false, makeMassageTTL(18000));
    }

    @Bean
    TopicExchange exchange() {
        return new TopicExchange(EXCHANGE_NAME, true, false);
    }

    /**
     * We've already created a fanout exchange and a queue.
     * Now we need to tell the exchange to send messages to our queue.
     * That relationship between exchange and a queue is called a binding.
     *
     * @param queue
     * @param exchange
     * @return
     */
    @Bean
    Binding binding(Queue queue, TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(ROUTING_KEY1);
    }

    @Bean
    public AmqpAdmin amqpAdmin() {
        return new RabbitAdmin(connectionFactory());
    }

    @Bean
    public RabbitTemplate rabbitTemplate() {
        RabbitTemplate template = new RabbitTemplate(connectionFactory());
        template.setExchange(EXCHANGE_NAME);
        //The routing key is set to the name of the queue by the broker for the default exchange
        return template;
    }

    @Bean
    SimpleMessageListenerContainer container(ConnectionFactory connectionFactory, MessageListenerAdapter listenerAdapter) {
        SimpleMessageListenerContainer container = new SimpleMessageListenerContainer();
        container.setConnectionFactory(connectionFactory);
        container.setQueueNames(queue);
        container.setMessageListener(listenerAdapter);
        return container;
    }

    @Bean
    MessageListenerAdapter listenerAdapter() {
        return new MessageListenerAdapter() {
            @Override
            public void onMessage(Message message) {
            }
        };
    }

    public static Map<String, Object> makeMassageTTL(int millisec) {
        Map<String, Object> args = new HashMap<String, Object>();
        args.put("x-message-ttl", millisec);
        return args;
    }

}
