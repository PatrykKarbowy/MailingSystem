package com.mailapp;

import java.util.ArrayList;
import java.util.List;

public class MailDatabase{

    private List<String> firstNames = new ArrayList<>();
    private List<String> lastNames = new ArrayList<>();
    private List<String> departments = new ArrayList<>();
    private List<String> companies = new ArrayList<>();
    private List<String> passwords = new ArrayList<>();

    public void addMailToDatabase(String password, String company, String department, String firstName, String lastName){
        setPasswords(password);
        setCompany(company);
        setDepartments(department);
        setFirstNames(firstName);
        setLastNames(lastName);
    }

    public void setPasswords(String password){
        this.passwords.add(password);
    }

    public void setLastNames(String lastName){
        this.lastNames.add(lastName);
    }

    public void setFirstNames(String firstName){
        this.firstNames.add(firstName);
    }

    public void setDepartments(String department) {
        if (!departments.contains(department)) {
            this.departments.add(department);
        }
    }
    public void setCompany(String company){
        if (!companies.contains(company)){
            this.companies.add(company);
        }
    }

    public void showDatabase(){
        System.out.println("[1 - firstName] [2 - lastName] [3 - password] [4 - department] [5 - company]\n");
        System.out.print(firstNames);
        System.out.print(lastNames);
        System.out.print(passwords);
        System.out.print(departments);
        System.out.print(companies);
    }

}
