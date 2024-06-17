package com.composite.AntiPattern;

import java.util.ArrayList;
import java.util.List;

public class AntiTeam{
    private String name;
    private List<Employee> members = new ArrayList<>();

    public AntiTeam(String name) {
        this.name = name;
    }

    public void addMember(Employee member, String position) {
        members.add(member);
        member.setPosition(position);
    }

    public void removeMember(Employee member) {
        members.remove(member);
        member.setPosition(null);
    }

    public void showDetails() {
        System.out.println("Membros do time " +this.name +": ");
        for (Employee member : members) {
            member.showDetails();
        }
    }
}