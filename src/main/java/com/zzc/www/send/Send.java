package com.zzc.www.send;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by pc on 2017/5/4.
 */

@Component
public class Send {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(){
        amqpTemplate.convertAndSend("hello","----------------------this is aaaa---------------------");
    }
}
