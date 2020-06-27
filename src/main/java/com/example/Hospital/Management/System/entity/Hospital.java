package com.example.Hospital.Management.System.entity;

import java.util.List;

public class Hospital {
    private String hospitalId;
    private String hospitalName;
    private int hospitalNumber;

    private Hospital(){

    }

    public String getHospitalId() {
        return hospitalId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public int getHospitalNumber() {
        return hospitalNumber;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalId='" + hospitalId + '\'' +
                ", hospitalName='" + hospitalName + '\'' +
                ", hospitalNumber='" + hospitalNumber + '\'' +
                '}';
    }

    public static class Builder{
        private String hospitalId;
        private String hospitalName;
        private int hospitalNumber;


        public Builder(String hospitalId){
            this.hospitalId = hospitalId;
        }
        public Hospital.Builder setHospitalName(String hospitalName) {
            this.hospitalName = hospitalName;
            return this;
        }

        public Hospital.Builder setHospitalNumber(){
            this.hospitalNumber = hospitalNumber;
            return this;
        }

        public Hospital.Builder copy(Hospital hospital){
            this.hospitalId = hospitalId;
            this.hospitalName = hospitalName;
            this.hospitalNumber = hospitalNumber;
            return this;
        }

        public Hospital build(){
            Hospital hospital = new Hospital();
            hospital.hospitalId = hospitalId;
            hospital.hospitalName = hospitalName;
            hospital.hospitalNumber = hospitalNumber;
            return hospital;
        }
    }
}
