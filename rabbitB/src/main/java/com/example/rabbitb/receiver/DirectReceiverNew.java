package com.example.rabbitb.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 与DirectReceiver一起
 * 轮询接受消息，不会重复消费
 */
@Component
@RabbitListener(queues = "TestDirectQueue")//监听的队列名称 TestDirectQueue
public class DirectReceiverNew {
    @RabbitHandler
    public void process(Map testMessage) {
        System.out.println("第二个DirectReceiver消费者收到消息  : " + testMessage.toString());
    }
}
