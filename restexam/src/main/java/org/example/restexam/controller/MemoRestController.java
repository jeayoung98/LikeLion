package org.example.restexam.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api/memos")
public class MemoRestController {
    private final Map<Long, String> memos = new HashMap<>();
    private final AtomicLong counter = new AtomicLong();

    @PostMapping
    public ResponseEntity<Long> createMemo(@RequestBody Map<String, String> requestBody) {
        String content = requestBody.get("memo");
        Long id = counter.incrementAndGet();
        memos.put(id, content);
        return ResponseEntity.ok(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> showMemo(@PathVariable("id") Long id) {
        String memo = memos.get(id);
        if (memo == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(memo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateMemo(@PathVariable("id") Long id, @RequestBody Map<String, String> requestBody) {
        if (!memos.containsKey(id)) {
            return ResponseEntity.notFound().build();
        }
        String content = requestBody.get("content");
        memos.put(id, content);
        return ResponseEntity.ok("메모 수정 성공!!");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteMemo(@PathVariable("id") Long id) {
        if (!memos.containsKey(id)) {
            return ResponseEntity.notFound().build();
        }
        memos.remove(id);
        return ResponseEntity.ok("삭제 성공 !!!");
    }
}
