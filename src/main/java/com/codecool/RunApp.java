package com.codecool;

import java.util.Scanner;

public class RunApp {

    public void showMenu( BankAccount newBankAccount ) {

        char option;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome " + newBankAccount.customerName + ", customer ID " + newBankAccount.customerId);
        System.out.println("\n");

        System.out.println("B. Check Balance");
        System.out.println("D. Deposit");
        System.out.println("W. Withdraw");
        System.out.println("T. List Transaction");
        System.out.println("E. Exit");

        do {
            System.out.println("========================================================================================");
            System.out.println("Enter an option: B-Balance | D-Deposit | W - Withdraw | T - List Transactions | E - Exit");
            System.out.println("========================================================================================");
            option = scanner.next().charAt(0);
            System.out.println("\n");

            switch (option) {
                case 'B' :
                case 'b': {
                    System.out.println("-----------------------------------");
                    System.out.println("Balance : " + newBankAccount.balance);
                    System.out.println("-----------------------------------");
                    System.out.println("\n");
                    break;
                }
                case 'D' :
                case 'd' :{
                    System.out.println("-----------------------------------");
                    System.out.println("Current balance: " + newBankAccount.balance);
                    System.out.println("Enter an amount to deposit: ");
                    System.out.println("-----------------------------------");
                    int amountToDeposit = scanner.nextInt();
                    newBankAccount.Deposit(amountToDeposit);
                    System.out.println("\n");
                    break;
                }
                case 'W' :
                case 'w' :{
                    System.out.println("-----------------------------------");
                    System.out.println("Current balance: " + newBankAccount.balance);
                    System.out.println("Enter an amount to withdraw: ");
                    System.out.println("-----------------------------------");
                    int amountToWithdraw = scanner.nextInt();
                    newBankAccount.Withdraw(amountToWithdraw);
                    System.out.println("\n");
                    break;
                }
                case 'T' :
                case 't' :{
                    System.out.println("-----------------------------------");
                    newBankAccount.getPreviousTransactions();
                    System.out.println("-----------------------------------");
                    System.out.println("Current balance: " + newBankAccount.balance);
                    break;
                }
                case 'E' :
                case 'e' :
                {
                    System.out.println("Finished with banking operations! Exiting!");
                    System.out.println("Thank you for using our services!");
                    System.exit(1);
                }
                default : System.out.println("Invalid option! Please try again.");
                    break;
            }

        } while (option!='E' || option!='e');

    }
}
