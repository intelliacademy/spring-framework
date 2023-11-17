package com.intellibucket.lesson.springframework.renderer;

import com.intellibucket.lesson.springframework.provider.HelloWorldMessageProvider;

public class MessageRenderer {
    private HelloWorldMessageProvider messageProvider;

    public void setMessageProvider(HelloWorldMessageProvider messageProvider) {
        this.messageProvider = messageProvider;
        System.out.println("MessageRenderer setMessageProvider");
    }

    public void render() {
        System.out.println(messageProvider.getMessage());
    }
}
