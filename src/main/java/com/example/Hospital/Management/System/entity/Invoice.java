package com.example.Hospital.Management.System.entity;

public class Invoice {

    private long invoiceNum;
    private Account details;


    public Invoice(Builder builder){

        this.invoiceNum = invoiceNum;
        this.details = details;

    }


    public long getInvoiceNum() { return invoiceNum; }

   public Account getDetails(){ return details; }


    public String toString(){


        return "Invoice" + "  invoiceNum: " + invoiceNum + " details " + details ;
    }

    public static class Builder {
        private  long invoiceNum;
        private  Account details;


        public Builder(long invoiceNum,Account details){
            this.invoiceNum = invoiceNum;
            this.details = details;
        }


        public Builder setInvoiceNum(long invoiceNum) {

            this.invoiceNum = invoiceNum;
            return this;
        }

        public Builder setDetails(Account details) {
            this.details = details;
            return this;
        }

        private Builder copy(Account account){

            this.invoiceNum = invoiceNum;
            this.details = details;
            return this;
        }
        public Invoice build(){

            return new Invoice(this);

        }

    }

}


