package com.example.WebSocketTest;

import lombok.*;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
public class HelloMessage {
    private String name;
    private String content;
    private Date date;

    @Builder
    public HelloMessage(String name, String content, Date date) {
        this.name = name;
        this.content = content;
        this.date = date;
    }
}
