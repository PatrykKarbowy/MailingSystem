package com.mailapp;

import java.util.Scanner;

public class DatabaseService extends Mail{
    MailDatabase database = new MailDatabase();
    Scanner sc = new Scanner(System.in);

    public DatabaseService(){
        databaseProgram();
        database.showDatabase();
    }

    private void databaseProgram(){
        int databaseRemover;
        String programOperator = "";
        String operator = "";
        int index = 0;
        while(!operator.equals("Y")){
            System.out.print("Do you want to show Database? (Y/N): ");
            programOperator = sc.nextLine();
            if(programOperator.equals("Y"))
                database.showDatabase();
            System.out.print("Do you want to remove from Database? (Y/N): ");
            programOperator = sc.nextLine();
            if(programOperator.equals("Y")) {
                System.out.print("Choose an index to remove: ");
                databaseRemover = sc.nextInt();
                sc.nextLine();
                database.removeMailFromDatabase(databaseRemover);
            }
            var mail = new Mail();
            mail.userInput();
            mail.generatePassword();
            database.addMailToDatabase(
                    index,
                    mail.getPassword(),
                    mail.getCompanyName(),
                    mail.getDepartment(),
                    mail.getFirstName(),
                    mail.getLastName(),
                    mail.getGeneratedMail());
            ++index;
            System.out.print("Do you want to quit? (Y/N): ");
            operator = sc.nextLine();
        }
    }

}
