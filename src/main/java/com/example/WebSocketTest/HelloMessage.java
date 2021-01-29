package com.example.WebSocketTest;

import lombok.*;

@Getter @Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class HelloMessage {
    @NonNull
    private String name;
}
