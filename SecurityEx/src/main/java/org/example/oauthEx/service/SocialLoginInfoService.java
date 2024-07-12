package org.example.oauthEx.service;

import lombok.RequiredArgsConstructor;
import org.example.oauthEx.domain.SocialLoginInfo;
import org.example.oauthEx.repository.SocialLoginInfoRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SocialLoginInfoService {
    private final SocialLoginInfoRepository socialLoginInfoRepository;

    public SocialLoginInfo saveSocialLoginInfo(String provider,String socialId) {
        SocialLoginInfo socialLoginInfo = new SocialLoginInfo();
        socialLoginInfo.setProvider(provider);
        socialLoginInfo.setSocialId(socialId);

        return socialLoginInfoRepository.save(socialLoginInfo);
    }

    public Optional<SocialLoginInfo> findByProviderAndUuidAndSocialId(String provider, String uuid, String socialId) {
        return socialLoginInfoRepository.findByProviderAndUuidAndSocialId(provider, uuid, socialId);
    }
}
