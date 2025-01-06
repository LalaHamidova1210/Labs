package turing;

public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Programming Language:" + programmingLanguage);
    }

    public void calculateBonus(double percentage, double fixedAmount) {
        double developerBonus = salary * (percentage / 100) + fixedAmount + (programmingLanguage.equals("Java") ? 200 : 0);
        System.out.println("Developer Bonus: " + developerBonus);

    }
}
