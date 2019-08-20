package com.example.rabbitmq.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @description:
 * @author: Kecheng Xie
 * @since: 2019-08-16 12:25
 **/
@Configuration
public class RabbitDirectConfig {
    public final static String DIRECTNAME = "sang-direct";

    @Bean
    Queue queue(){
        // return new ("hello queue");
        return new Queue("hello-queue");
    }

    @Bean
    DirectExchange directExchange(){
        return new DirectExchange(DIRECTNAME,true,false);
    }

    @Bean
    Binding binding(){
        // return BindingBuilder().bind(queue()).to(directExchange()).with("direct");
        return BindingBuilder.bind(queue()).to(directExchange()).with("direct");
    }
}
