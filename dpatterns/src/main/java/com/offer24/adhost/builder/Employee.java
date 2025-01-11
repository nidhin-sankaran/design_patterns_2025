package com.offer24.adhost.builder;

public class Employee {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    private String name;
    private int age;
    private double salary;
    private String designation;
    private String department;

    private Employee(EmployeeBuilder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.salary = builder.salary;
        this.designation = builder.designation;
        this.department = builder.department;

    }
    public static class EmployeeBuilder {
        private String name;
        private int age;
        private double salary;
        private String designation;

        public String getDepartment() {
            return department;
        }

        public EmployeeBuilder setDepartment(String department) {
            this.department = department;
            return this;
        }

        public String getDesignation() {
            return designation;
        }

        public EmployeeBuilder setDesignation(String designation) {
            this.designation = designation;
            return this;
        }

        public double getSalary() {
            return salary;
        }

        public EmployeeBuilder setSalary(double salary) {
            this.salary = salary;
            return this;

        }

        public int getAge() {
            return age;
        }

        public EmployeeBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getName() {
            return name;
        }

        public EmployeeBuilder setName(String name) {
            this.name = name;
            return this;
        }

        private String department;

        public static  EmployeeBuilder getBuilder(){
            return new EmployeeBuilder();
        }
        public Employee build(){
            return new Employee(this);
        }

    }
}
