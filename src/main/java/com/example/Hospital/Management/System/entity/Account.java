package com.example.Hospital.Management.System.entity;


public class Account {

    private String accountId;
    private double balance;
    private String paymentMethod;

    public Account(Builder builder) {
        this.accountId = accountId;
        this.balance = balance;
        this.paymentMethod = paymentMethod;

    }

    public String getAccountId() { return accountId; }

    public double getBalance() { return balance; }

    public String getPaymentMethod() { return paymentMethod; }

    @Override
    public String toString(){

        return "Account" + "  accountId:  " + accountId
                + "  " + "  balance:  " + balance
                + " " + " paymentMethod  " + paymentMethod ;
    }

    public static class Builder{
        private String accountId;
        private double balance;
        private String paymentMethod;

        public Builder(String accountId,double balance,String paymentMethod) {
            this.accountId = accountId;
            this.balance = balance;
            this.paymentMethod  = paymentMethod;

        }

        public Builder setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        public Builder setBalance(double balance) {
            this.balance = balance;
            return this;
        }

        public Builder setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public Builder copy(Account account){
            this.accountId = accountId;
            this.balance = balance;
            this.paymentMethod = paymentMethod;
            return this;
        }

        public Account build(){

            return new Account(this);
        }
    }

}
