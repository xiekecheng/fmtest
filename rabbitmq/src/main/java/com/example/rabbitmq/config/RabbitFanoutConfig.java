package com.example.rabbitmq.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: 将队列绑定至Fanout上,当消息发送给FanoutExchange时,会转发至绑定其的消息队列上
 * @author: Kecheng Xie
 * @since: 2019-08-16 16:01
 **/
@Configuration
public class RabbitFanoutConfig {
    public static final String FANOUTNAME = "sang-fanout";

    @Bean
    FanoutExchange fanoutExchange(){
        return new FanoutExchange(FANOUTNAME,true,false);
    }

    @Bean
    Queue queue1(){
        return new Queue("queue1");
    }

    @Bean
    Queue queue2(){
        return new Queue("queue2");
    }

    @Bean
    Binding binding1(){
        return BindingBuilder.bind(queue1()).to(fanoutExchange());
    }
    @Bean
    Binding binding2(){
        return BindingBuilder.bind(queue2()).to(fanoutExchange());
    }
}
