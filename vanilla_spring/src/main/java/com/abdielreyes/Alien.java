package com.abdielreyes;

import java.beans.ConstructorProperties;

public class Alien {

    private int age;
    // private Laptop lap;
    private Computer com;
    private int salary;

    // // for names use constructor properties
    // @ConstructorProperties({ "age", "lap" })
    // public Alien(int age, Laptop lap) {
    // System.out.println("Parameter constructor called");
    // this.age = age;
    // this.lap = lap;
    // }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Alien() {
        System.out.println("Alien object created");
    }

    public void code() {
        System.out.println("I am coding");
        // lap.compile();
        com.compile();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

}
