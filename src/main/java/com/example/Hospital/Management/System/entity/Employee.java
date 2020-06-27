package com.example.Hospital.Management.System.entity;

import java.util.List;

public class Employee {
    private String education;
    private String certification;
    private List<String> languages;

    public Employee(EmployeeBuilder employeeBuilder){
        this.education = education;
        this.certification = certification;
        this.languages = languages;
    }

    public String getEducation() {
        return education;
    }

    public String getCertification() {
        return certification;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public static class EmployeeBuilder{
        private String education;
        private String certification;
        private List<String> languages;


        public EmployeeBuilder(String education, String certification, List<String> languages) {
            this.education = education;
            this.certification = certification;
            this.languages = languages;
        }

        public EmployeeBuilder setEducation(String education) {
            this.education = education;
            return this;
        }

        public EmployeeBuilder setCertification(String certification) {
            this.certification = certification;
            return this;
        }

        public EmployeeBuilder setLanguages(List<String> languages) {
            this.languages = languages;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }

        public EmployeeBuilder copy(Employee employee){
            this.education = employee.education;
            this.certification = employee.certification;
            this.languages = employee.languages;
            return this;
        }
    }

}
