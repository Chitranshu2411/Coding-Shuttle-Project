package com.codingshuttle.projects.CodeNova_AI.dto.auth;

public record SignupRequest(
        String email,
        String name,
        String password
) {
}