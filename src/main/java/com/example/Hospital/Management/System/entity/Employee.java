package com.example.Hospital.Management.System.entity;

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

        public EmployeeBuilder(){}


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
            Employee emp = new Employee();
            emp.education = education;
            emp.certification = certification;
            emp.languages = languages;
            return emp;
        }

        public EmployeeBuilder copy(Employee employee){
            this.education = employee.education;
            this.certification = employee.certification;
            this.languages = employee.languages;
            return this;
        }
    }

}
