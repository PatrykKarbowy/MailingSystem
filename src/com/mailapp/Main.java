package com.mailapp;

public class Main {

    public static void main(String[] args) {
        MailDatabase database = new MailDatabase();
	    var mail1 = new Mail("Patryk", "Karbowy", "R&D", "WordFall",  10);
        var mail2 = new Mail("Kamil", "Kochmaniewicz", "R&D", "WordFall",  10);

        database.addMailToDatabase(mail1.getPassword(), mail1.getCompanyName(), mail1.getDepartment(), mail1.getFirstName(), mail1.getLastName());
        database.addMailToDatabase(mail2.getPassword(), mail2.getCompanyName(), mail2.getDepartment(), mail2.getFirstName(), mail1.getLastName());
        database.showDatabase();
    }
}
