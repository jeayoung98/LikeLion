package org.example.springdatajpa2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // 쿼리 메서드로 추가하고, 테스트 코드

    // 이름으로 조회
    Customer findByName(String name);

    // 이메일로 조회
    Customer findByEmail(String email);

    // 이메일에 특정 문자열을 포함하고 있는 고개 조회
    List<Customer> findByEmailContains(String str);

    // 고객과 그들의 주문 수 계산
    @Query("SELECT c, count(o) from Customer c left join c.orders o group by c")
    List<Object[]> findCustomerOrderCount();

    // 고객의 세부 정보와 그들의 각장 최근 주문 조회
    @Query("select c, o from Customer c join c.orders o where o.date = (select max(o2.date) from Order o2 where o2.customer =c)")
    List<Object[]> findCustomersWithLatestOrder();

    // 평균 나이보다 많은 고객 조회
    @Query("select c from Customer c where c.age > (select avg(c2.age) from Customer  c2)")
    List<Customer> findCustomersOlderThanAverage();

}
