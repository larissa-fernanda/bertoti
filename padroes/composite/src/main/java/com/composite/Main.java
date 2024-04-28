package com.composite;

import com.composite.AntiPattern.Employee;
import com.composite.AntiPattern.Team;
import com.composite.Pattern.IndividualEmployee;
import com.composite.Pattern.Team;

public class Main {
    public static void main(String[] args) {
        Employee antiDev1 = new Employee("John", "Developer");
        Employee antiDev2 = new Employee("Alice", "Developer");
        Employee antiDesigner = new Employee("Bob", "Designer");

        Team antiTeam = new Team("Development Team", "Team Leader");

        antiTeam.addMember(antiDev1);
        antiTeam.addMember(antiDev2);
        antiTeam.addMember(antiDesigner);

        antiTeam.showDetails();

        System.out.println("--------------------------------------------------");
        IndividualEmployee patternDev1 = new IndividualEmployee("John", "Developer");
        IndividualEmployee patternDev2 = new IndividualEmployee("Alice", "Developer");
        IndividualEmployee patternDesigner = new IndividualEmployee("Bob", "Designer");

        com.composite.Pattern.Team patternDevelopmentTeam = new com.composite.Pattern.Team("Development Team");
        patternDevelopmentTeam.addMember(patternDev1);
        patternDevelopmentTeam.addMember(patternDev2);

        com.composite.Pattern.Team patternMarketingTeam = new com.composite.Pattern.Team("Marketing Team");
        patternMarketingTeam.addMember(patternDesigner);

        com.composite.Pattern.Team patternCompany = new com.composite.Pattern.Team("Company");
        patternCompany.addMember(patternDevelopmentTeam);
        patternCompany.addMember(patternMarketingTeam);

        patternCompany.showDetails();
    }
}