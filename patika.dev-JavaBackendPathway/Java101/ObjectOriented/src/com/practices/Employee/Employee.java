package com.practices.Employee;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    int currentYear;

    Employee (String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.currentYear = 2021;
    }

    double tax(){
        double tax;
        if (this.salary < 1000){
            return 0;
        } else {
            tax = this.salary * 0.03;
            return tax;
        }
    }

    double bonus(){
        double bonusSalary;
        if (this.workHours > 40) {
            bonusSalary = (workHours - 40) * 30;
            return bonusSalary;
        } else {
            return 0;
        }
    }

    double raiseSalary(){
        double raise;
        if (this.currentYear - this.hireYear < 10 && this.currentYear - this.hireYear >= 0){
            raise = (this.salary * 0.05);
            return raise;
        }
        if (this.currentYear - this.hireYear >= 10 && this.currentYear - this.hireYear < 20) {
            raise = (this.salary * 0.1);
            return raise;
        }
        if (this.currentYear - this.hireYear > 19){
            raise = (this.salary * 0.15);
            return raise;
        }
        return 0;
    }

    void printInfo(){
        double allSalary = this.salary + this.bonus() + this.raiseSalary() - this.tax();
        double salaryWith = this.salary + this.bonus() - this.tax();
        System.out.println("Name\t\t\t\t\t\t\t:\t" + this.name);
        System.out.println("Salary\t\t\t\t\t\t\t:\t" + this.salary);
        System.out.println("Work Hours\t\t\t\t\t\t:\t" + this.workHours);
        System.out.println("Hire Year\t\t\t\t\t\t:\t" + this.hireYear);
        System.out.println("Tax\t\t\t\t\t\t\t\t:\t" + this.tax());
        System.out.println("Bonus\t\t\t\t\t\t\t:\t" + this.bonus());
        System.out.println("Raise Salary\t\t\t\t\t:\t" + this.raiseSalary());
        System.out.println("Salary with taxs and bonusses\t:\t" + salaryWith);
        System.out.println("All salary\t\t\t\t\t\t:\t" + allSalary);

    }
}
