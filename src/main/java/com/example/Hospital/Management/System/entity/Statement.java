package com.example.Hospital.Management.System.entity;

public class Statement {

    private int statementNum;
    private Account details;


    public Statement(){
        this.statementNum = statementNum;
        this.details = details;

    }

    public int getStatementNum() { return statementNum; }

    public void setStatementNum(int statementNum) {
        this.statementNum = statementNum;
    }
    public void setDetails(Account details) {
        this.details = details;

    }

    public String toString(){

        return "Statement" + "  statementNum: " + statementNum + " details: " + details  ;
    }
}
