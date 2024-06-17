package com.composite;

import com.composite.AntiPattern.Employee;
import com.composite.AntiPattern.AntiTeam;
import com.composite.AntiPattern.Company;
import com.composite.Pattern.IndividualEmployee;
import com.composite.Pattern.Team;

public class Main {
    public static void main(String[] args) {
        // Anti-Pattern
        Employee antiEmployee = new Employee("John");
        Employee antiEmployee2 = new Employee("Alice");
        Employee antiEmployee3 = new Employee("Bob");

        AntiTeam antiTeam = new AntiTeam("Development Team");
        AntiTeam antiTeam2 = new AntiTeam("Marketing Team");
        AntiTeam antiTeam3 = new AntiTeam("Design Team");


        antiTeam.addMember(antiEmployee, "Developer");
        antiTeam2.addMember(antiEmployee2, "Camera");
        antiTeam3.addMember(antiEmployee3, "Designer");

        Company antiCompany = new Company("Company1");
        antiCompany.addEmployee(antiEmployee);
        antiCompany.addEmployee(antiEmployee2);
        antiCompany.addEmployee(antiEmployee3);

        antiCompany.addTeam(antiTeam);
        antiCompany.addTeam(antiTeam2);
        antiCompany.addTeam(antiTeam3);

        // Pattern
        System.out.println("--------------------------------------------------");
        IndividualEmployee patternDev1 = new IndividualEmployee("John", "Developer");
        IndividualEmployee patternDev2 = new IndividualEmployee("Alice", "Developer");
        IndividualEmployee patternDesigner = new IndividualEmployee("Bob", "Designer");

        Team patternDevelopmentTeam = new Team("Development Team");
        patternDevelopmentTeam.addMember(patternDev1);
        patternDevelopmentTeam.addMember(patternDev2);

        Team patternMarketingTeam = new Team("Marketing Team");
        patternMarketingTeam.addMember(patternDesigner);

        Team patternCompany = new Team("Company");
        patternCompany.addMember(patternDevelopmentTeam);
        patternCompany.addMember(patternMarketingTeam);

        patternCompany.showDetails();
    }
}