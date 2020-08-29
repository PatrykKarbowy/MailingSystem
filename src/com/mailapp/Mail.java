package com.mailapp;

import java.util.Scanner;

public class Mail {

    private String password;
    private String firstName;
    private String lastName;
    private String department;
    private String companyName;
    private int passwordLength;

    public void generatePassword(){
        String passwordChar = "ABCDEFGHIJKLMNOPRSTWUVXYZ123456789%*#!?abcdefghijklmnoprstwuvxyz";
        String newPassword = "";
        while (newPassword.length() < passwordLength){
            int randomIndex = (int)(Math.random()*passwordChar.length());
            newPassword = newPassword + passwordChar.charAt(randomIndex);
        }
        this.password = newPassword;
    }

    public void userInput() {
        Scanner sc = new Scanner(System.in);
            try {
                System.out.print("First Name: ");
                this.firstName = sc.nextLine();
                System.out.print("Last Name: ");
                this.lastName = sc.nextLine();
                System.out.print("Department: ");
                this.department = sc.nextLine();
                System.out.print("Company: ");
                this.companyName = sc.nextLine();
                System.out.print("Password length: ");
                this.passwordLength = sc.nextInt();
                sc.nextLine();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input format!");
                sc.nextLine();
            }
    }

    public String getGeneratedMail(){
        return firstName + "." + lastName + "@" + department + "." + companyName + ".com";
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getDepartment(){
        return department;
    }

    public String getPassword(){
        return password;
    }

    public String getCompanyName(){
        return companyName;
    }

}
