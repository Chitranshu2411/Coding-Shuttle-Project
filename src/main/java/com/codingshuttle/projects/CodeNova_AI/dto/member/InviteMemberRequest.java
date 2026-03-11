package com.codingshuttle.projects.CodeNova_AI.dto.member;

import com.codingshuttle.projects.CodeNova_AI.enums.ProjectRole;

public record InviteMemberRequest(
        String email,
        ProjectRole role
) {
}