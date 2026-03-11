package com.codingshuttle.projects.CodeNova_AI.dto.subscription;

public record UsageTodayResponse(
     int tokensUsed,
     int tokensLimit,
     int previousRunning,
     int previousLimit
) {
}