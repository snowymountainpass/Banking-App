package com.codecool;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TreeMap;

public class BankAccount {
    public int balance;
    String customerName;
    String customerId;
    TreeMap<String,Integer> transactionHistory;

    BankAccount(String customerName, String customerId, int balance) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.balance = balance;
        this.transactionHistory = new TreeMap<>();
    }

    public void Deposit(int amount){
        this.balance +=amount;
        LocalDateTime transactionDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedTransactionDateTime = transactionDateTime.format(dateTimeFormat);
        transactionHistory.put(formattedTransactionDateTime,amount);

    }
    public void Withdraw(int amount){
        this.balance -=amount;
        LocalDateTime transactionDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedTransactionDateTime = transactionDateTime.format(dateTimeFormat);
        transactionHistory.put(formattedTransactionDateTime,-amount);

    }

    public void getPreviousTransactions() {
        if (transactionHistory.size() != 0) {

            for (String transactionDate : transactionHistory.keySet()){
                if (transactionHistory.get(transactionDate)>0){

                    System.out.println(transactionHistory.get(transactionDate) + " was DEPOSITED!");
                    System.out.println("\n");
                }
                else {
                    System.out.println(Math.abs(transactionHistory.get(transactionDate)) + " was WITHDRAWN!");
                    System.out.println("\n");
                }
            }

        }  else {
            System.out.println("No transaction occurred!");
        }
    }

}
