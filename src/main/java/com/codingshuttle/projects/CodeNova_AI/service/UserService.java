package com.codingshuttle.projects.CodeNova_AI.service;

import com.codingshuttle.projects.CodeNova_AI.dto.auth.UserProfileResponse;

public interface UserService {
    UserProfileResponse getProfile(Long userId);
}