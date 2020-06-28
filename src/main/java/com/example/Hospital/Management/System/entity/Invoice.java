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
}
