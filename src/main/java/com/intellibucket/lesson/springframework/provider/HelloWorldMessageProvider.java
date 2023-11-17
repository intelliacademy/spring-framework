package com.intellibucket.lesson.springframework.provider;

public class HelloWorldMessageProvider {
    public HelloWorldMessageProvider() {
        System.out.println("HelloWorldMessageProvider constructor");
    }


    public String getMessage() {
        return "Hello World!";
    }
}
