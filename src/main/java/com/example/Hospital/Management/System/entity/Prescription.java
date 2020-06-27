package com.example.Hospital.Management.System.entity;

public class Prescription {
    private String prescriptionId, medicationId, visitId;


    public Prescription(Builder builder) {
        this.prescriptionId = prescriptionId;
        this.medicationId = medicationId;
        this.visitId = visitId;
    }
    private Prescription(){

    }

    public String getPrescriptionId() {
        return prescriptionId;
    }

    public String getMedicationId() {
        return medicationId;
    }

    public String getVisitId() {
        return visitId;
    }

    @Override
    public String toString() {
        return "Prescription{" +
                "prescriptionId='" + prescriptionId + '\'' +
                ", medicationId='" + medicationId + '\'' +
                ", visitId='" + visitId + '\'' +
                '}';
    }

    public static class Builder{
        private String prescriptionId, medicationId, visitId;

        public Builder(String prescriptionId,String medicationId,String visitId){
            this.prescriptionId = prescriptionId;
            this.medicationId = medicationId;
            this.visitId = visitId;
        }

        public Builder setPrescriptionId(String prescriptionID) {
            this.prescriptionId = prescriptionId;
            return this;
        }


        public Builder setMedicationId(String medicationId) {
            this.medicationId = medicationId;
            return this;
        }

        public Builder setVisitId(String visitId) {
            this.visitId = visitId;
            return this;
        }

        public Builder copyPrescription(Prescription prescription){
            this.prescriptionId = prescriptionId;
            this.medicationId = medicationId;
            this.visitId = visitId;
            return this;

        }

        public Prescription build(){
            return new Prescription(this);

        }
    }
}