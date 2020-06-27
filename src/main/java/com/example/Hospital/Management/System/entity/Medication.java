package com.example.Hospital.Management.System.entity;

public class Medication {
    private String prescriptionId, medicationId, visitId;


    public Medication(Builder builder){
        this.medicationId = medicationId;
        this.prescriptionId = prescriptionId;
        this.visitId = visitId;

    }
    private Medication(){

    }

    public String getMedicationId(){return medicationId;}

    public String getPrescriptionId(){return prescriptionId;}

    public String getVisitId(){return visitId;}

    @Override
    public String toString() {
        return "Medication{" +
                "prescriptionId='" + prescriptionId + '\'' +
                ", medicationId='" + medicationId + '\'' +
                ", visitId='" + visitId + '\'' +
                '}';
    }

    public static class Builder{
        private String prescriptionId, medicationId, visitId;

        public Builder(String medicationId, String prescriptionId, String visitId ){
            this.medicationId = medicationId;
            this.prescriptionId = prescriptionId;
            this.visitId = visitId;
        }

        public Builder(String medicationId){this.medicationId = medicationId;}

        public Builder setMedicationId(String medicationId){
            this.medicationId = medicationId;
            return this;
        }

        public Builder setPrescriptionId(String prescriptionId){
            this.prescriptionId =prescriptionId;
            return this;
        }

        public Builder setVisit(String visitId){
            this.visitId = visitId;
            return this;
        }

        public Builder copyMedication(Medication medication) {
            this.prescriptionId = prescriptionId;
            this.medicationId = medicationId;
            this.visitId = visitId;
            return this;
        }

        public Medication build(){
            Medication medication = new Medication();

            medication.medicationId = medicationId;
            medication.prescriptionId = prescriptionId;
            medication.visitId = visitId;
            return medication;

        }
    }
}
