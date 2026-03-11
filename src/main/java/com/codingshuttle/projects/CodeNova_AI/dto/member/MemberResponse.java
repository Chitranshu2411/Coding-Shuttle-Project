package com.codingshuttle.projects.CodeNova_AI.dto.member;

import com.codingshuttle.projects.CodeNova_AI.enums.ProjectRole;

import java.time.Instant;

public record MemberResponse(
        Long userid,
        String email,
        String name,
        String avatarUrl,
        ProjectRole role,
        Instant invitedAt
) {
}