package com.composite.AntiPattern;

public class Employee {
    private String name;
    private String position;

    public Employee(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void showDetails() {
        System.out.println("Name: " + name + ", Position: " + position);
    }
}
