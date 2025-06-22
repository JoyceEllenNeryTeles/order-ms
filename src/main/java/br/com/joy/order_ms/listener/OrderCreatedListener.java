package br.com.joy.order_ms.listener;

import br.com.joy.order_ms.dto.OrderCreatedEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import static br.com.joy.order_ms.configuration.RabbitMqConfig.ORDER_CREATED_QUEUE;

@Component
public class OrderCreatedListener {

    private  final Logger log = LoggerFactory.getLogger(OrderCreatedListener.class);
    @RabbitListener(queues = ORDER_CREATED_QUEUE)
    public void listen(Message<OrderCreatedEvent> message) {
        log.info("Message received : {}", message);
    }
}
