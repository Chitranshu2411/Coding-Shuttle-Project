package com.codingshuttle.projects.CodeNova_AI.service;
import com.codingshuttle.projects.CodeNova_AI.dto.subscription.PlanLimitResponse;
import com.codingshuttle.projects.CodeNova_AI.dto.subscription.UsageTodayResponse;
import org.jspecify.annotations.Nullable;

public interface UsageService {
     UsageTodayResponse getTodayUsage(Long userId);

      PlanLimitResponse getCurrentSubscriptionLimitsOfUser(Long userId);
}