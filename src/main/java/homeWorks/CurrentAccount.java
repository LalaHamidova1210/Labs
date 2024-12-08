package homeWorks;

public class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String accountHolder, double balance, int accountNumber, double overdraftLimit) {
        super(accountHolder, balance, accountNumber);
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double amount) {
        if (balance - amount < -overdraftLimit) {
            System.out.println("Overdraft limit exceeded.");
        } else {
            balance -= amount;
            System.out.println(amount + " withdrawn from current account.");
        }
    }

        public void displayInfo () {
            super.displayInfo();
            System.out.println("Overdraft Limit: " + overdraftLimit);
        }


}
