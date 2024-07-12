package org.example.jwtEx.service;

import lombok.RequiredArgsConstructor;
import org.example.jwtEx.domain.RefreshToken;
import org.example.jwtEx.repository.RefreshTokenRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RefreshTokenService {
    private final RefreshTokenRepository refreshTokenRepository;

    public RefreshToken addRefreshToken(RefreshToken refreshToken) {
        return refreshTokenRepository.save(refreshToken);
    }

    public Optional<RefreshToken> findRefreshToken(String refreshToken) {
        return refreshTokenRepository.findByValue(refreshToken);
    }

    public void deleteRefreshToken(String refreshToken) {
        refreshTokenRepository.findByValue(refreshToken).ifPresent(refreshTokenRepository::delete);
    }
}
