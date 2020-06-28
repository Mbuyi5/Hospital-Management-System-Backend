package com.example.Hospital.Management.System.entity;

public class Invoice {

    private long invoiceNum;
    private Account details;


    public Invoice(){

        this.invoiceNum = invoiceNum;
        this.details = details;
    }

    public long getInvoiceNum() { return invoiceNum; }

    public void setInvoiceNum(long invoiceNum) {
        this.invoiceNum = invoiceNum;
    }
    public void setDetails(Account details) {
        this.details = details;

    }

    public String toString(){


        return "Invoice" + "  invoiceNum: " + invoiceNum + " details " + details ;
    }

    public static class Builder {
        private long invoiceNum;
        private Account details;


        public Builder(long invoiceNum){
            this.invoiceNum = invoiceNum;
        }
        public Builder setInvoiceNum(long invoiceNum) {
            this.invoiceNum = invoiceNum;
            return this;
        }

        public Builder setDetails(Account details) {
            this.details = details;
            return this;
        }

    }

    public Invoice copy(Account account){
        this.invoiceNum = invoiceNum;
        this.details = details;
        return this;
    }
    public Invoice build(){

        Invoice Invoice1 = new Invoice();
        Invoice1.invoiceNum = invoiceNum;
        Invoice1.details = details;
        return Invoice1;

    }

}


