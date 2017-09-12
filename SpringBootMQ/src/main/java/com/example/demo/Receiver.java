package com.example.demo;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/9/12.
 */
@Component
public class Receiver {
    @JmsListener(destination = "my-destination")
    public void  receivedMessage(String message){
        System.out.println("接受到"+message);
    }
}
