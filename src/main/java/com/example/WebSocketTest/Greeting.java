package com.example.WebSocketTest;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@Getter
@NoArgsConstructor
@RequiredArgsConstructor
public class Greeting {
    @NonNull
    private String content;
    @NonNull
    private Date date;
}
