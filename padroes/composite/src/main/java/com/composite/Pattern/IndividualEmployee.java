package com.composite.Pattern;

public class IndividualEmployee implements Employee{
    private String name;
    private String position;

    public IndividualEmployee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void showDetails() {
        System.out.println("Name: " + name + ", Position: " + position);
    }
}
