package com.codegnan.oopexamples;
public class Salary {
    int empId;
    String name;
    double salary;
    int experience;

    
    public Salary() {
        this(0, "Unknown", 0.0, 0);
    }

    
    public Salary(int empId, String name) {
        this(empId, name, 0.0, 0);
    }

    
    public Salary(int empId, String name, double salary) {
        this(empId, name, salary, 0);
    }

   
    public Salary(int empId, String name, double salary, int experience) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }

    
    public double calculateBonus() {
        if (this.experience < 3) {
            return this.salary * 0.05;
        } else if (this.experience <= 7) {
            return this.salary * 0.10;
        } else {
            return this.salary * 0.15;
        }
    }

    
    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("ID: " + this.empId);
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Experience: " + this.experience);
        System.out.println("Bonus: " + this.calculateBonus());
    }
}
