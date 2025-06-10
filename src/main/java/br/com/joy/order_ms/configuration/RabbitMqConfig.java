package br.com.joy.order_ms.configuration;

import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {

    public static final String ORDER_CREATED_NAME = "order_created_queue";
}
