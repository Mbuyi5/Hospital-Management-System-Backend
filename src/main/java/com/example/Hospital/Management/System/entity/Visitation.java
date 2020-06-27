package com.example.Hospital.Management.System.entity;

import java.util.Date;

public class Visitation {
    private String visitId,patientId,doctorId,prescriptionId;
    private Date visitDate;


    public Visitation(Builder Builder){
        this.visitId = visitId;
        this.visitDate = visitDate;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.prescriptionId = prescriptionId;
        this.visitDate = visitDate;
    }

    private Visitation(){

    }

    public String getVisitId() {
        return visitId;
    }

    public String getPatientId() {
       return patientId;
    }

    public String getDoctorId() {
       return doctorId;
    }

    public String getPrescriptionId() {
        return prescriptionId;
    }

    public Date getVisitDate() {
       return visitDate;
    }



    @Override
    public String toString() {
        return "Visitation{" +
                "visitId='" + visitId + '\'' +
                ", patientId='" + patientId + '\'' +
                ", doctorId='" + doctorId + '\'' +
                ", prescriptionId='" + prescriptionId + '\'' +
                ", visitDate=" + visitDate +
                '}';
    }

    public static class Builder{
        private String visitId,patientId,doctorId,prescriptionId;
        private Date visitDate;

        public Builder(String visitId, String patientId, String doctorId, String prescriptionId, Date visitDate)
        {
            this.visitId = visitId;
            this.patientId = patientId;
            this.doctorId = doctorId;
            this.prescriptionId = prescriptionId;
            this.visitDate = visitDate;

        }

        public Builder (String visitId){this.visitId = visitId;}
        public Builder setVisitId(String visitId){
            this.visitId = visitId;
            return this;
        }

        public Builder setPatientId(String patientId) {
            this.patientId = patientId;
            return this;
        }

        public Builder setDoctorId(String doctorId) {
            this.doctorId = doctorId;
            return this;
        }

        public Builder setPrescriptionId(String prescriptionId) {
            this.prescriptionId = prescriptionId;
            return this;
        }

        public Builder setVisitDate(Date visitDate) {
            this.visitDate = visitDate;
            return this;
        }

        public Visitation build(){
            Visitation visitation = new Visitation();

            visitation.visitId = visitId;
            visitation.patientId = patientId;
            visitation.doctorId = doctorId;
            visitation.prescriptionId =prescriptionId;
            visitation.visitDate = visitDate;
            return visitation;


        }
    }
}
