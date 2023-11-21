package com.intellibucket.lesson.springframework;

import com.intellibucket.lesson.springframework.model.ChildModel;
import com.intellibucket.lesson.springframework.model.SpringTestBean;
import com.intellibucket.lesson.springframework.renderer.MessageRenderer;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringFrameworkApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");



        SpringTestBean bean = applicationContext.getBean( "testBeanWithCons", SpringTestBean.class);
        ChildModel child = applicationContext.getBean( "childModel", ChildModel.class);
        System.out.println(child);
    }

}
