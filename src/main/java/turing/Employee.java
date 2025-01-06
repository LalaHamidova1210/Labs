package turing;

public class Employee {
    private String name;
    public double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    //@Override
    public void displayInfo() {
        System.out.println("Employee name:" + name);
        System.out.println("Employee Salary:" + salary);
    }

    public void  calculateBonus(double percentage) {
        double bonus = salary * (percentage / 100);
        System.out.println("Bonus percentage: " + bonus);
    }
    public void  calculateBonus (  double percentage, double fixedAmount){
        double bonusandfixed = salary * (percentage / 100) + fixedAmount;
        System.out.println("Bonus percentage and fixed amount: " + bonusandfixed);

    }

    }
