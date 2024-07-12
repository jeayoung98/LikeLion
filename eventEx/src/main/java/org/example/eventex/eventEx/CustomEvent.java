package org.example.eventex.eventEx;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

// 1. 이벤트를 정의
@Getter
public class CustomEvent extends ApplicationEvent {
    private String message;


    public CustomEvent(Object source,String message) {
        super(source);
        this.message=message;
    }
}
