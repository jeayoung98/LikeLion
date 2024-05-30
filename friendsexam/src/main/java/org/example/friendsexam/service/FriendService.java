package org.example.friendsexam.service;

import lombok.RequiredArgsConstructor;
import org.example.friendsexam.domain.Friend;
import org.example.friendsexam.repository.FriendRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class FriendService {
    private final FriendRepository friendRepository;

    @Transactional(readOnly = true) // 읽을때는
    public Iterable<Friend> findAllFriends() {
        return friendRepository.findAll();
    }

    // 친구 등록
    @Transactional // save 하는것들은 붙여주기
    public Friend saveFriend(Friend friend) {
    }

    // id에 해당하는 친구 정보 조회
    @Transactional(readOnly = true)
    public Friend findFriendById(Long id) {
        return friendRepository.findById(id).orElse(null);
    }

    @Transactional
    public void deleteFriendById(Long id) {
        friendRepository.deleteById(id);
    }
}
