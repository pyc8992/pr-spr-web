package com.docki.book.springboot.domain.event;

import lombok.Data;

@Data
public class RegisteredPostEvent {
    private String title;
    private String content;
    private String author;

    public RegisteredPostEvent(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
