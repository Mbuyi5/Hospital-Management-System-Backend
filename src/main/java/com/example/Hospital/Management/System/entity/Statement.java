package com.example.Hospital.Management.System.entity;

public class Statement {

    private int statementNum;
    private Account details;


    public Statement(int statementNum,Account details ){

        this.statementNum = statementNum;
        this.details = details;

    }

    public Statement(Builder builder){

        this.statementNum = statementNum;
        this.details = details;

    }

    public int getStatementNum() { return statementNum; }

    public Account getDetails() {

        return details; }



    public String toString(){

        return "Statement" + "  statementNum: " +
                statementNum + " details: " + details  ;
    }

    public static class Builder {
        private int statementNum;
        private Account details;

        public Builder(int statementNum,Account details) {
            this.statementNum = statementNum;
            this.details = details;
        }

        public Builder(int statementNum){
            this.statementNum = statementNum;
        }

        public Builder setStatement(int addrestatementNumss) {
            this.statementNum = statementNum;
            return this;
        }

        public Builder setDetails(Account details) {
            this.details = details;
            return this;
        }

        public Builder copy(Account account){
            this.statementNum = statementNum;
            this.details = details;
            return this;
        }

        public Statement build(){

            return new Statement(this);

        }
    }
}
