package org.example.eventex.webSocket;

import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MyWebSocketHandler extends TextWebSocketHandler {

    private static final Set<WebSocketSession> sessions = Collections.synchronizedSet(new HashSet<>());

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        System.out.println("세션 연결 성공 :: " + session.getId());
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        // Echo 서버는 메세지 보낸 세션에만 다시 메세지를 보내주면 끝
        // 그렇다면 chat 서버는 ?


        String payload = message.getPayload(); // 실제 메세지
        System.out.println("수신된 메세지 :: " + payload);
        // 채팅만들때 ECHO
//        session.sendMessage(new TextMessage("Echo :: " + payload));
        synchronized (sessions) {
            for (WebSocketSession webSocketSession : sessions) {
                if (webSocketSession.isOpen()) {
                    webSocketSession.sendMessage(new TextMessage(payload));
                }
            }
        }
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {

        System.out.println("세션 연결 종료 :: " + session.getId());
    }
}
