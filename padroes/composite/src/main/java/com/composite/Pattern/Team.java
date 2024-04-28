package com.composite.Pattern;

import java.util.ArrayList;
import java.util.List;

public class Team implements Employee {
    private String teamName;
    private List<Employee> members = new ArrayList<>();

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public void addMember(Employee member) {
        members.add(member);
    }

    public void removeMember(Employee member) {
        members.remove(member);
    }

    @Override
    public void showDetails() {
        System.out.println("Team: " + teamName);
        for (Employee member : members) {
            member.showDetails();
        }
    }
}
