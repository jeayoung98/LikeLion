package org.example.eventex.transactionEvent;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationManager;

@Service
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;
    private final ApplicationEventPublisher applicationEventPublisher;

    @Transactional
    public void registerItem(String name, int price) {
        Item item = new Item(name,price);
        // 아이템 저장
        itemRepository.save(item);
        // 이벤트 등록 !!
//        ItemRegistrationEvent event = new ItemRegistrationEvent(this, name, price);
//        applicationEventPublisher.publishEvent(event);

        TransactionSynchronizationManager.registerSynchronization(new TransactionSynchronization() {
            @Override
            public void afterCommit() {
                ItemRegistrationEvent event = new ItemRegistrationEvent(this, name, price);
                applicationEventPublisher.publishEvent(event);
            }
        });
    }
}
