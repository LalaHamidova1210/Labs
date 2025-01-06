package turing;
public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Lala", 3000);
        employees[1] = new Manager("Vusal", 7000, 3);
        employees[2] = new Developer("Ali", 5000, "Java");

        for (Employee employee : employees) {
            employee.displayInfo();
            employee.calculateBonus(10);
            employee.calculateBonus(10, 500);
            System.out.println();
        }

    }
}