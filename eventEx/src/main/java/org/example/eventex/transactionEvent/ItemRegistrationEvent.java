package org.example.eventex.transactionEvent;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

@Getter
@Setter
public class ItemRegistrationEvent extends ApplicationEvent {

    private final String name;
    private final int price;

    public ItemRegistrationEvent(Object source,String name, int price) {
        super(source);
        this.name = name;
        this.price = price;
    }
}
