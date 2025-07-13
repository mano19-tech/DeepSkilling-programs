package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // Singleton Bean
        Student s1 = (Student) context.getBean("student1");
        s1.display();

        // Prototype Bean
        Student s2 = (Student) context.getBean("student2");
        s2.display();

        // Fetching again to show scope difference
        Student s3 = (Student) context.getBean("student2");
        System.out.println("Are student2 and student3 same? " + (s2 == s3)); // false if prototype
    }
}
