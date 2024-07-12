package org.example.oauthEx.service;

import lombok.RequiredArgsConstructor;
import org.example.oauthEx.domain.SocialUser;
import org.example.oauthEx.repository.SocialUserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SocialUserService {
    private final SocialUserRepository socialUserRepository;

    // 소셜에서 정보를 가져와서 저장하거나, 이미 있다면 수정하거나
    public SocialUser saveORUpdateUser(String socialId, String provider, String username, String email, String avatarUrl) {
        Optional<SocialUser> existUser = socialUserRepository.findBySocialIdAndProvider(socialId, provider);
        SocialUser socialUser;
        if (existUser.isPresent()) {
            // 이미 소셜 유저 정보를 가진 사용자라면
            socialUser = existUser.get();
            socialUser.setUsername(username);
            socialUser.setEmail(email);
            socialUser.setAvatarUrl(avatarUrl);
        } else {
            socialUser = new SocialUser();
            socialUser.setSocialId(socialId);
            socialUser.setUsername(username);
            socialUser.setEmail(email);
            socialUser.setAvatarUrl(avatarUrl);
        }
    }
}
