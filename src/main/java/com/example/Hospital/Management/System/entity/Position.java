package com.example.Hospital.Management.System.entity;

public class Position {

    private static String positionCode;
    private static String positionStatus;


    private Position(Builder builder) {
        this.positionCode= builder.positionCode;
        this.positionStatus= builder.positionStatus;


    }

    public String getPositionCode() {
        return positionCode;
    }

    public String getPositionStatus() {
        return positionStatus;
    }

    @Override
    public String toString() {
        return "Position{" +
                "positionCode='" + positionCode + '\'' +
                ", positionStatus='" + positionStatus + '\'' +
                '}';
    }

    public static class Builder{

        String positionCode,positionStatus;

        public Builder setPositionCode (String positionCode){

            this.positionCode= positionCode;
            return this;

        }


        public Builder copy (Position job){

            this.positionCode= Position.positionCode;
            this.positionStatus= Position.positionStatus;
            return this;

        }

        public Builder setPositionStatus(String positionStatus){

            this.positionStatus= positionStatus;
            return this;

        }

        public Position build(){

        return new Position(this);

        }


    }





}
