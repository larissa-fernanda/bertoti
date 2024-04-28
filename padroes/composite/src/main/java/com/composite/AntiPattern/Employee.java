package com.composite.AntiPattern;

public class Employee {
    private String name;
    private String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void showDetails() {
        System.out.println("Name: " + name + ", Position: " + position);
    }
}
