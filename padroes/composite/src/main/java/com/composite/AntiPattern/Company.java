package com.composite.AntiPattern;

import java.util.List;

public class Company {
    private String name;
    private List<Employee> employees;
    private List<AntiTeam> teams;

    public Company(String name) {
        this.name = name;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public void addTeam(AntiTeam team) {
        teams.add(team);
    }

    public void removeTeam(AntiTeam team) {
        teams.remove(team);
    }

}
