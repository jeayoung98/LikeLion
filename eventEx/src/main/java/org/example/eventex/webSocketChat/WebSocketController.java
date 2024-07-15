package org.example.eventex.webSocketChat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebSocketController {
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/chat")
    public String chat(){
        return "chat";
    }
}