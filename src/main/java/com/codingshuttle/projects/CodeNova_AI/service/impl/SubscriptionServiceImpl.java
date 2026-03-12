package com.codingshuttle.projects.CodeNova_AI.service.impl;

import com.codingshuttle.projects.CodeNova_AI.dto.subscription.CheckoutRequest;
import com.codingshuttle.projects.CodeNova_AI.dto.subscription.CheckoutResponse;
import com.codingshuttle.projects.CodeNova_AI.dto.subscription.portalResponse;
import com.codingshuttle.projects.CodeNova_AI.service.SubscriptionService;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {
    @Override
    public SubscriptionService getCurrentSubscription(Long userId) {
        return null;
    }

    @Override
    public CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId) {
        return null;
    }

    @Override
    public portalResponse openCustomerPortal(Long userId) {
        return null;
    }
}