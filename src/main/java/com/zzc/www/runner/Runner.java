//package com.zzc.www.runner;
//
//import com.zzc.www.App;
//import com.zzc.www.receiver.Receiver;
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.stereotype.Component;
//
//import java.util.concurrent.TimeUnit;
//
///**
// * Created by pc on 2017/5/3.
// */
//@Component
//public class Runner implements CommandLineRunner {
//
//    private final RabbitTemplate rabbitTemplate;
//    private final Receiver receiver;
//    private final ConfigurableApplicationContext context;
//
//    public Runner(Receiver receiver, RabbitTemplate rabbitTemplate,
//                  ConfigurableApplicationContext context) {
//        this.receiver = receiver;
//        this.rabbitTemplate = rabbitTemplate;
//        this.context = context;
//    }
//
//    @Override
//    public void run(String... strings) throws Exception {
//        System.out.println("Sending message...");
//        rabbitTemplate.convertAndSend(App.queueName, "Hello from RabbitMQ!");
//        receiver.getLatch().await(10000, TimeUnit.MILLISECONDS);
//        context.close();
//    }
//}
