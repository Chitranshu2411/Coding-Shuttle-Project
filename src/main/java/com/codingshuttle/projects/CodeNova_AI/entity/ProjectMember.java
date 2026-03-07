package com.codingshuttle.projects.CodeNova_AI.entity;

import com.codingshuttle.projects.CodeNova_AI.enums.ProjectRole;

import java.time.Instant;

public class ProjectMember {

    ProjectMemberId id;

    Project project;

    User user;

    ProjectRole projectRole;

    Instant invitedAt;
    Instant acceptedAt;
}