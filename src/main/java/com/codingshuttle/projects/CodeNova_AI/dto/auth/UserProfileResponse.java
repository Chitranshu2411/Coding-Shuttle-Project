    package com.codingshuttle.projects.CodeNova_AI.dto.auth;

    public record UserProfileResponse(
            Long id,
            String email,
            String name,
            String avatarUrl
    ) {
    }