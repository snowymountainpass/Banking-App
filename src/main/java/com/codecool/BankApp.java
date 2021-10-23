package com.codecool;

public class BankApp {

    public static void main(String[] args) {
        BankAccount newBankAccount = new BankAccount("Ciprian Vasile","B0001",0);
        RunApp runApp = new RunApp();

        runApp.showMenu(newBankAccount);

    }
}
