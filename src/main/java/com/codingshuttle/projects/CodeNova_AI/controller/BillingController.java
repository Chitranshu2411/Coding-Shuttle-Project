package com.codingshuttle.projects.CodeNova_AI.controller;

import com.codingshuttle.projects.CodeNova_AI.dto.subscription.CheckoutRequest;
import com.codingshuttle.projects.CodeNova_AI.dto.subscription.CheckoutResponse;
import com.codingshuttle.projects.CodeNova_AI.dto.subscription.PlanResponse;
import com.codingshuttle.projects.CodeNova_AI.dto.subscription.portalResponse;
import com.codingshuttle.projects.CodeNova_AI.service.PlanService;
import com.codingshuttle.projects.CodeNova_AI.service.SubscriptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BillingController {

    private final PlanService planService;
    private final SubscriptionService subscriptionService;

    @GetMapping("/api/plans")
    public ResponseEntity<List<PlanResponse>> getAllPlans() {
        return ResponseEntity.ok(planService.getAllActivePlans());
    }

    @GetMapping("/api/me/subscription")
    public ResponseEntity<SubscriptionService> getMySubscription() {
        Long userId = 1L;
        return ResponseEntity.ok(subscriptionService.getCurrentSubscription(userId));
    }

    @PostMapping("/api/stripe/checkout")
    public ResponseEntity<CheckoutResponse> createCheckoutResponse(
            @RequestBody CheckoutRequest request
    ) {
        Long userId = 1L;
        return ResponseEntity.ok(subscriptionService.createCheckoutSessionUrl(request, userId));
    }

    @PostMapping("/api/string/portal")
    public ResponseEntity<portalResponse> openCustomerPortal() {
        Long userId = 1L;
        return ResponseEntity.ok(subscriptionService.openCustomerPortal(userId));
    }
}