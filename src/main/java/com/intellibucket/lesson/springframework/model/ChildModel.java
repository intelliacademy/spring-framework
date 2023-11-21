package com.intellibucket.lesson.springframework.model;

public class ChildModel extends AbstractParentModel{
    private final String lastName;

    public ChildModel(String name, String lastName) {
        super(name);
        this.lastName = lastName;
        System.out.println("ChildModel constructor");
    }

    @Override
    public String toString() {
        return "ChildModel{" +
                "name='" + name + '\'' +
                "lastName='" + lastName + '\'' +
                '}';
    }
}
