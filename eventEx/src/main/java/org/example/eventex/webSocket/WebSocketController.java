package org.example.eventex.webSocket;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebSocketController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
