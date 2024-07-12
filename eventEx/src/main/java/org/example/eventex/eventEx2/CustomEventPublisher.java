package org.example.eventex.eventEx2;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

// 3. 이벤트 등록
@Component
@RequiredArgsConstructor
public class CustomEventPublisher {

    // post-comment 예제 였다면 이 클래스가 CommentService 였을거
    private final ApplicationEventPublisher applicationEventPublisher;

    // 댓글 등록 하는 메서드 였을거
    public void publisherEvent(final String message) {
        System.out.println("댓글 등록");
        System.out.println("publisherEvent Thread Name :: "+Thread.currentThread().getName());

        // 댓글 등록하는 일을 하고

        CustomEvent event = new CustomEvent(this,message);
        applicationEventPublisher.publishEvent(event);
    }
}
