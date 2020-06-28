package com.example.Hospital.Management.System.entity;

public class Account {

    private String accountId;
    private double balance;
    private String paymentMethod;

    public Account(String accountId, double balance, String paymentMethod){
        this.accountId = accountId;
        this.balance = balance;
        this.paymentMethod = paymentMethod;
    }

    public Account(){

    }

    public String getAccountId() { return accountId; }

    public double getBalance() { return balance; }

    public String getPaymentMethod() { return paymentMethod; }


    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String toString(){

        return "Account" + "  accountId:  " + accountId + "  " + "  balance:  " + balance + " " + " paymentMethod  " + paymentMethod ;
    }
}
