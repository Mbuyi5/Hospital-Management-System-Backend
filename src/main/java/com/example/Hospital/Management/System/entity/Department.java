package com.example.Hospital.Management.System.entity;

public class Department {
    private int departmentId;
    private int employeeId;
    private String ward;
    private String role;

    public Department(DepartmentBuilder departmentBuilder){
        this.departmentId = departmentId;
        this.employeeId = employeeId;
        this.ward = ward;
        this.role = role;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getWard() {
        return ward;
    }

    public String getRole() {
        return role;
    }


    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", employeeId=" + employeeId +
                ", ward='" + ward + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    public static class DepartmentBuilder{
        private int departmentId;
        private int employeeId;
        private String ward;
        private String role;

        public DepartmentBuilder setDepartmentId(int departmentId) {
            this.departmentId = departmentId;
            return this;
        }

        public DepartmentBuilder setEmployeeId(int employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        public DepartmentBuilder setWard(String ward) {
            this.ward = ward;
            return this;
        }

        public DepartmentBuilder setRole(String role) {
            this.role = role;
            return this;
        }

        public Department build(){
            Department dep = new Department;
            dep.departmentId = departmentId;
            dep.employeeId = employeeId;
            dep.role = role;
            dep.ward = ward;
            return dep;
        }

        public DepartmentBuilder copy(Department department){
            this.departmentId = department.departmentId;
            this.employeeId = department.employeeId;
            this.role = department.role;
            this.ward = department.ward;
            return this;
        }
    }


}
