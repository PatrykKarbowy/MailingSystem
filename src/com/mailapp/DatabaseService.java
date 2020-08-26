package com.mailapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DatabaseService{
    MailDatabase database = new MailDatabase();
    List<Mail> mailList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    String firstName;
    String lastName;
    String department;
    String company;
    int passwordLength;

    public DatabaseService(){
        databaseProgram();
        database.showDatabase();
    }

    private void databaseProgram(){
        String operator = "";
        while(!operator.equals("Y")){
            userInput();
            var mail = new Mail(firstName, lastName, department, company, passwordLength);
            mailList.add(mail);
            database.addMailToDatabase(mail.getPassword(), mail.getCompanyName(), mail.getDepartment(), mail.getFirstName(), mail.getLastName());
            System.out.print("Do you want to quit? (Y/N): ");
            operator = sc.nextLine();
        }
    }

    private void userInput(){
        System.out.print("First Name: ");
        this.firstName = sc.nextLine();
        System.out.print("Last Name: ");
        this.lastName = sc.nextLine();
        System.out.print("Department: ");
        this.department = sc.nextLine();
        System.out.print("Company: ");
        this.company = sc.nextLine();
        System.out.print("Password length: ");
        this.passwordLength = sc.nextInt();
        sc.nextLine();
    }
}
