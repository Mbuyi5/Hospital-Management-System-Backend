package com.example.Hospital.Management.System.entity;


public class Person {
    private int personId;
    private String fName, lName;
    private String date;

    public Person(Builder builder) {
        this.personId = personId;
        this.fName = fName;
        this.lName = lName;
        this.date = date;
    }

    private Person(){
    }

    public int getPersonId() {
        return personId;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", date=" + date +
                '}';
    }

    public static class Builder{
        private int personId;
        private String fName, lName;
        private String date;

        public Builder(int personId, String fName, String lName, String date) {
            this.personId = personId;
            this.fName = fName;
            this.lName = lName;
            this.date = date;
        }

        public Builder(int personId) {
            this.personId = personId;
        }

        public Builder setPersonId(int personId) {
            this.personId = personId;
            return this;
        }

        public Builder setfName(String fName) {
            this.fName = fName;
            return this;
        }

        public Builder setlName(String lName) {
            this.lName = lName;
            return this;
        }

        public Builder setDate(String date) {
            this.date = date;
            return this;
        }

        public Builder copy(Person person){
            this.personId = personId;
            this.fName = fName;
            this.lName = lName;
            this.date = date;
            return this;
        }

        public Person build(){
            Person person = new Person();
            person.personId = personId;
            person.fName = fName;
            person.lName = lName;
            person.date = date;
            return person;
        }
    }
}
