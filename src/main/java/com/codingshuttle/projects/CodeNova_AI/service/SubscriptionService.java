package com.codingshuttle.projects.CodeNova_AI.service;

import com.codingshuttle.projects.CodeNova_AI.dto.subscription.CheckoutRequest;
import com.codingshuttle.projects.CodeNova_AI.dto.subscription.CheckoutResponse;
import com.codingshuttle.projects.CodeNova_AI.dto.subscription.portalResponse;
import org.jspecify.annotations.Nullable;

public interface SubscriptionService {
    SubscriptionService getCurrentSubscription(Long userId);

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId);

    portalResponse openCustomerPortal(Long userId);
}