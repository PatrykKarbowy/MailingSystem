package com.mailapp;

public class Mail {
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private String companyName;
    private int passwordLength;

    public Mail(String firstName, String lastName, String department, String companyName, int passwordLength){
        this.firstName = firstName.toLowerCase();
        this.lastName = lastName.toLowerCase();
        this.department = department.toLowerCase();
        this.passwordLength = passwordLength;
        this.companyName = companyName.toLowerCase();
        generatePassword();
        generateMail();
    }

    private void generatePassword(){
        String passwordChar = "ABCDEFGHIJKLMNOPRSTWUVXYZ123456789%*#!?abcdefghijklmnoprstwuvxyz";
        String newPassword = "";
        while (newPassword.length() < passwordLength){
            int randomIndex = (int)(Math.random()*passwordChar.length());
            newPassword = newPassword + passwordChar.charAt(randomIndex);
        }
        this.password = newPassword;
    }

    private String generateMail(){
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
