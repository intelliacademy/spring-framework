package com.intellibucket.lesson.springframework;

import com.intellibucket.lesson.springframework.renderer.MessageRenderer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringFrameworkApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        MessageRenderer messageRenderer = applicationContext.getBean("renderer", MessageRenderer.class);
        messageRenderer.render();
    }

}
