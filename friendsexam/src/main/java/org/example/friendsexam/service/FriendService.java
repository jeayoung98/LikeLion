package org.example.friendsexam.service;

import lombok.RequiredArgsConstructor;
import org.example.friendsexam.domain.Friend;
import org.example.friendsexam.repository.FriendRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

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
        //spring Data 에서 제공하는 save 라는 메서드는 id 에 해당하는 값이 이미 존재한다면 수정
        // 없다면 생성
        return friendRepository.save(friend); // 등록도 되지만 수정도 됨
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

    // 페이징 처리된 친구 목록 조회
    public Page<Friend> findAllFriends(Pageable pageable) {
        Pageable sortedByDescId = PageRequest.of(pageable.getPageNumber(), pageable.getPageSize(),
                Sort.by(Sort.Direction.DESC, "id"));

        return friendRepository.findAll(sortedByDescId);
    }
}

