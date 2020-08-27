package com.mailapp;

import java.util.ArrayList;
import java.util.List;

public class MailDatabase{

    private List<String> firstNames = new ArrayList<>();
    private List<String> lastNames = new ArrayList<>();
    private List<String> departments = new ArrayList<>();
    private List<String> companies = new ArrayList<>();
    private List<String> passwords = new ArrayList<>();
    private List<String> mails = new ArrayList<>();
    private List<Integer> indexes = new ArrayList<>();

    public void addMailToDatabase(int index, String password, String company, String department, String firstName, String lastName, String mail){
        setIndexes(index);
        setPasswords(password);
        setCompany(company);
        setDepartments(department);
        setFirstNames(firstName);
        setLastNames(lastName);
        setMails(mail);
        System.out.println("\nMail added to database!\n");
    }

    public void removeMailFromDatabase(int index){
        firstNames.remove(index);
        lastNames.remove(index);
        departments.remove(index);
        companies.remove(index);
        passwords.remove(index);
        mails.remove(index);
        indexes.remove(index);
        System.out.println("\nID " + index + " is removed from Database!\n");

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

    public void setMails(String mail){
        this.mails.add(mail);
    }

    public void setDepartments(String department) {
            this.departments.add(department);
    }
    public void setCompany(String company){
            this.companies.add(company);
    }

    public void setIndexes(int index) {
        this.indexes.add(index);
    }

    public void showDatabase() {
        System.out.println("INDEX | [1 - firstName] [2 - lastName] [3 - password] [4 - department] [5 - company] [6 - mail address]\n");
        for (int i = 0; i < indexes.size(); i++) {
            System.out.print(indexes.get(i) + " | ");
            System.out.print(firstNames.get(i)+ " | ");
            System.out.print(lastNames.get(i)+ " | ");
            System.out.print(passwords.get(i)+ " | ");
            System.out.print(departments.get(i)+ " | ");
            System.out.print(companies.get(i)+ " | ");
            System.out.println(mails.get(i));
        }
    }
}
