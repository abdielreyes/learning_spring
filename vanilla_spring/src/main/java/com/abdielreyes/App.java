package com.abdielreyes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // // by default beans use singleton pattern
        // // using prototype, a new object is created every time that the bean is
        // called
        // Alien a = (Alien) context.getBean("alien2");
        // a.age = 10;
        // System.out.println(a.age);

        // Alien a2 = (Alien) context.getBean("alien2");
        // System.out.println(a2.age);
        Alien a = (Alien) context.getBean("alien");
        System.out.println(a.getAge());
        a.code();
        // this alien must be type of Alien
        Alien b = (Alien) context.getBean("alien", Alien.class);
    }
}
