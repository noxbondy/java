package org.example;

public class BankAccount {
    static double interestRate = 5.0;
    String accountHolder;
    double balance;
    public void deposit(double amount) {
    balance += amount;
    }
}
