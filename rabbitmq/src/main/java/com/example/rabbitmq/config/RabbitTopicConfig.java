package com.example.rabbitmq.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: Kecheng Xie
 * @since: 2019-08-16 16:37
 **/
@Configuration
public class RabbitTopicConfig {
    public static final String TOPICNAME = "sang-topic";

    @Bean
    TopicExchange topicExchange(){
        return new TopicExchange(TOPICNAME,true,false);

    }

    @Bean
    Queue xiaomi(){
        return new Queue("xiaomi");
    }

    @Bean
    Queue huawei(){
        return new Queue("huawei");
    }

    @Bean
    Queue iphone(){
        return new Queue("iphone");
    }

    @Bean
    Binding xiaomiBinding(){
        return BindingBuilder.bind(xiaomi()).to(topicExchange()).with("xiaomi.#");
    }

    @Bean
    Binding huaweiBinding(){
        return BindingBuilder.bind(huawei()).to(topicExchange()).with("huawei.#");
    }

    @Bean
    Binding iphoneBinding(){
        return BindingBuilder.bind(iphone()).to(topicExchange()).with("#.iphone.#");
    }
}
