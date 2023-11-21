package com.intellibucket.lesson.springframework.model;


public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void preDestroy() {
        System.out.println("Person preDestroy");
    }
}
