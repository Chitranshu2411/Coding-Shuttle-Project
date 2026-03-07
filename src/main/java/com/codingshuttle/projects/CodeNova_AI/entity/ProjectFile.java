package com.codingshuttle.projects.CodeNova_AI.entity;

import java.time.Instant;

public class ProjectFile {

    Long id;

    Project project;

    String path;

    String minioObjectKey;

    Instant createdAt;

    Instant deletedAt;

    User createdBy;

    User deletedBy;

}