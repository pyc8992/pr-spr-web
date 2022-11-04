package com.docki.book.springboot.domain.posts;

import com.docki.book.springboot.domain.event.RegisteredPostEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class PostsEventHandler {

    @Async
    @EventListener
    public void sendSms(RegisteredPostEvent event) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("new post = " + event);
    }
}
