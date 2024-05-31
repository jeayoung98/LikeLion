package org.example.springdatajpa2;

import org.example.springdatajpa.UserRepository;
import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;
import org.springframework.test.context.jdbc.SqlGroup;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
@Transactional
@Rollback(value = true)
class CustomerRepositoryTest {
    private static final Logger log = LoggerFactory.getLogger(CustomerRepositoryTest.class);
    @Autowired
    private CustomerRepository repository;


    @Test
    void save() {
        Customer customer = new Customer("jung", "jung@gmail.com", 27);
        repository.save(customer);
        Optional<Customer> customer1 = repository.findById(1L);
        log.info("저장된 사용자 : {}", customer1);
    }

    @Test
    void delete() {
        repository.deleteById(1L);
        Optional<Customer> customer = repository.findById(1L);
        assertThat(customer.isPresent()).isFalse();
    }

    @Test
    void findByName() {
        Customer customer = repository.findByName("홍길동");
        assertThat(customer.getName()).isEqualTo("홍길동");

    }

    @Test
    void findByEmail() {
        Customer customer = repository.findByEmail("hong@example.com");
        assertThat(customer.getEmail()).isEqualTo("hong@example.com");
    }

    @Test
    void findByEmailContains() {
        List<Customer> customers = repository.findByEmailContains("hong");
        assertThat(customers.size()).isEqualTo(1);
    }

    @Test
    @SqlGroup({
            @Sql(value = "classpath:db/test.sql",
                    config = @SqlConfig(encoding = "utf-8", separator = ";", commentPrefix = "--"),
                    executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
    })
    void findCustomerOrderCount() {
        List<Object[]> orderCount = repository.findCustomerOrderCount();
        orderCount.forEach(result -> {
            Customer customer = (Customer) result[0];
            Long count = (Long) result[1];
            log.info("고객 : {}, 주문 수 : {}", customer.getName(), count);
        });
    }


    @BeforeAll
    static void setUp() {
        log.info("------------> BeforeAll");
    }

    @AfterAll
    static void tearDown() {
        log.info("---------> AfterAll");
    }

    @BeforeEach
    void BeforeEach() {
        log.info("--------> BeforeEach");
    }
    @AfterEach
    void AfterEach() {
        log.info("--------> AfterEach");
    }
}