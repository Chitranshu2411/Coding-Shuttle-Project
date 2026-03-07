package com.codingshuttle.projects.CodeNova_AI.entity;

import com.codingshuttle.projects.CodeNova_AI.enums.SubscriptionStatus;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Subscription {
    Long id;

    User user;

    Plan plan;

    SubscriptionStatus status;

    String stripeCustomerId;
    String stripeSubsciptionId;

    Instant currentPeriodStart;
    Instant currentPeriodEnd;
    Boolean cancelAtPeriodEnd = false;

    Instant createdAt;
    Instant updatedAt;
}