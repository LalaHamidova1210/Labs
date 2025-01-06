package turing;

public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("TeamSize:" + teamSize);
    }
    public void calculateBonus(double percentage, double fixedAmount) {
        double managerBonus = salary * (percentage / 100) + fixedAmount + (teamSize * 100);
        System.out.println("Manager Bonus: " + managerBonus);
}
}