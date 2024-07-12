package org.example.oauthEx.repository;


import org.example.oauthEx.domain.SocialUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SocialUserRepository extends JpaRepository<SocialUser,Long> {
    Optional<SocialUser> findBySocialIdAndProvider(String socialId, String provider);
}
