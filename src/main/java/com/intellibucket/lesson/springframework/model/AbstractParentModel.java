package com.intellibucket.lesson.springframework.model;

public abstract class AbstractParentModel {
    protected String name;

    public AbstractParentModel(String name) {
        this.name = name;
        System.out.println("AbstractParentModel constructor");
    }

    public void init() {
        System.out.println("AbstractParentModel init");
    }

    public void destroy() {
        System.out.println("AbstractParentModel destroy");
    }
}
