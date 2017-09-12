package com.example.demo;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/9/12.
 */
@Component
public class Receiver {
    @RabbitListener(queues = "my-queue")
    public  void  ReceiveMesaage(String  message){
        System.out.println("接受到"+message);
    }
}
