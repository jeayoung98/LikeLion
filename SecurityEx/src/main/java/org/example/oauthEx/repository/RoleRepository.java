package org.example.oauthEx.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.example.oauthEx.domain.Role;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
