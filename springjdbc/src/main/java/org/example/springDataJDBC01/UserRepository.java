package org.example.springDataJDBC01;

import lombok.ToString;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface UserRepository extends CrudRepository<User,Long> { //<엔티티, id 타입>
    List<User> findByName(String name); // select * from users where name = ?
}
