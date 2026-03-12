package com.codingshuttle.projects.CodeNova_AI.service.impl;

import com.codingshuttle.projects.CodeNova_AI.dto.auth.AuthResponse;
import com.codingshuttle.projects.CodeNova_AI.dto.auth.LoginRequest;
import com.codingshuttle.projects.CodeNova_AI.dto.auth.SignupRequest;
import com.codingshuttle.projects.CodeNova_AI.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public AuthResponse signup(SignupRequest request) {
        return null;
    }

    @Override
    public AuthResponse login(LoginRequest request) {
        return null;
    }
}