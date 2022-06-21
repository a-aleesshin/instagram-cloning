package com.instagram.entity;

import javax.persistence.PrePersist;
import java.time.LocalDateTime;

public class Comment {
    private Long id;
    private String userName;
    private Long userId;
    private String post;
    private String message;
    private LocalDateTime createdDate;

    @PrePersist
    protected void onCreated() {
        this.createdDate = LocalDateTime.now();
    }
}
