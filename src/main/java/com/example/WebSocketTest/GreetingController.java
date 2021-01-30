package com.example.WebSocketTest;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import java.sql.Date;

@Controller
public class GreetingController {
    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public HelloMessage greeting(HelloMessage message) throws Exception {
        return HelloMessage.builder()
                .name(message.getName())
                .content(message.getContent())
                .date(new Date(System.currentTimeMillis()))
                .build();
    }
}
