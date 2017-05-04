package com.zzc.www.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

/**
 * Created by pc on 2017/5/3.
 */

@Component
@RabbitListener(queues = "hello")
public class Receiver {

    private CountDownLatch latch = new CountDownLatch(1);

    @RabbitHandler
    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
        latch.countDown();
    }

    public CountDownLatch getLatch() {
        return latch;
    }
}
