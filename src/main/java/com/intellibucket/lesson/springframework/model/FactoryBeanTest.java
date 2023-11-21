package com.intellibucket.lesson.springframework.model;

public class FactoryBeanTest {
    public SpringTestBean createInstance() {
        return new SpringTestBean();
    }
}
