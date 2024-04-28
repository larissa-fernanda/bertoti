package com.composite.AntiPattern;

import java.util.ArrayList;
import java.util.List;

public class Team  extends Employee{
    private List<Employee> members = new ArrayList<>();

    public Team(String name, String position) {
        super(name, position);
    }

    public void addMember(Employee member) {
        members.add(member);
    }

    public void removeMember(Employee member) {
        members.remove(member);
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Team Members:");
        for (Employee member : members) {
            member.showDetails();
        }
    }
}