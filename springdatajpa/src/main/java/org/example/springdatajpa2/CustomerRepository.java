package org.example.springdatajpa2;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
    // 쿼리 메서드로 추가하고, 테스트 코드

    // 이름으로 조회
    Customer findByName(String name);

    // 이메일로 조회
    Customer findByEmail(String email);

    // 이메일에 특정 문자열을 포함하고 있는 고개 조회
    List<Customer> findByEmailContains(String str);
}
