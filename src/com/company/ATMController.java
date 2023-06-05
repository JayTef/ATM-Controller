package com.company;

/**
 * ATMController is a controller class. It can receive user input from the View (any UI)
 * and update the Model and View.
 */

public class ATMController {


    // The fields are private and can only be accessed within this class.
    private ATMModel atmModel;
    private String cardNumber;


    // Constructor: Fields are initialised when the object is instantiated.
    public ATMController() {
        this.atmModel = new ATMModel();
        this.cardNumber = null;
    }


    // Return true if the inserted card number is valid, false otherwise.
    public boolean insertCard(String insertedCardNumber) {
        this.cardNumber = insertedCardNumber;

        // Validation is done in ATMModel as it deals with database and a bank API.
        boolean isValidCardNumber = atmModel.validateCardNumber(cardNumber);

        resetCardNumberIfFalse(isValidCardNumber);
        return isValidCardNumber;
    }


    // Return true if the entered PIN is valid, false otherwise.
    public boolean enterPIN(String pin) {

        // Validation is done in ATMModel as it deals with database and a bank API.
        boolean isValidPIN = atmModel.validatePIN(cardNumber, pin);

        resetCardNumberIfFalse(isValidPIN);
        return isValidPIN;
    }


    // Return true if the selected account is valid, false otherwise.
    public boolean selectAccount(String accountNumber) {

        // Validation is done in ATMModel as it deals with database and a bank API.
        boolean isValidAccount = atmModel.validateAccount(cardNumber, accountNumber);

        resetCardNumberIfFalse(isValidAccount);
        return isValidAccount;
    }


    // Reset insertedCardNumber to null if isValid is false.
    private void resetCardNumberIfFalse(boolean isValid) {
        if (!isValid) {
            cardNumber = null;
        }
    }


    // Return the account balance from the ATMModel.
    public int showTotalBalance() {
        return atmModel.getTotalBalance(cardNumber);
    }


    // Deposit the amount through the ATMModel.
    public void depositAmount(int amount) {
        atmModel.deposit(cardNumber, amount);
    }


    // Withdraw the amount through the ATMModel.
    public void withdrawAmount(int amount) {
        atmModel.withdraw(cardNumber, amount);
    }


}



