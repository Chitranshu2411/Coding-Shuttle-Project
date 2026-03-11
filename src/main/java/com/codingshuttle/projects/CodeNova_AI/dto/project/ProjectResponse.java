package com.codingshuttle.projects.CodeNova_AI.dto.project;

import com.codingshuttle.projects.CodeNova_AI.dto.auth.UserProfileResponse;

import java.time.Instant;

public record ProjectResponse(
        Long id,
        String name,
        Instant createdAt,
        Instant updatedAt,
        UserProfileResponse owner
) {
}