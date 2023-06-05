package com.company;

/**
 * ATMModel is a blueprint of a model class. So,the methods are NOT implemented yet.
 * This class handles database and a bank API.
 */

public class ATMModel {

    // Return true if the card number exists in the database and is valid, false otherwise.
    public boolean validateCardNumber(String cardNumber) {
        // Write your code here
        return true;
    }

    // Return true if the PIN is valid for the inserted card number, false otherwise.
    public boolean validatePIN(String cardNumber, String pin) {
        // Write your code here
        return true;
    }

    // Return true if the account is valid for the inserted card number, false otherwise.
    public boolean validateAccount(String cardNumber, String accountNumber) {
        // Write your code here
        return true;
    }

    // Return the total balance for the inserted card number.
    public int getTotalBalance(String cardNumber) {
        // Write your code here
        return 0;
    }

    // Deposit the amount into the account.
    public void deposit(String cardNumber, int amount) {
        // Write your code here
    }

    // Withdraw the amount from the account.
    public void withdraw(String cardNumber, int amount) {
        // Write your code here
    }
}
