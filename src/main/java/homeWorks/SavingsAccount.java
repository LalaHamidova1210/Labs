package homeWorks;

public class SavingsAccount extends BankAccount {
    private double monthlyInterestRate;
    private int withdrawalLimit = 3;
    private int withdrawalsThisMonth = 0;

    public SavingsAccount(String accountHolder, double balance, int accountNumber, double monthlyInterestRate) {
        super(accountHolder, balance, accountNumber);
        this.monthlyInterestRate = monthlyInterestRate;
    }

    public void withdraw(double amount) {
        if (withdrawalsThisMonth >= withdrawalLimit) {
            System.out.println("Withdrawal limit exceeded.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
            withdrawalsThisMonth++;
            System.out.println(amount + " withdrawn from savings account.");
        }
    }
    public void applyInterest() {
        balance += balance * (monthlyInterestRate / 100);
        System.out.println("Interest applied to savings account.");
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Monthly Interest Rate: " + monthlyInterestRate + "%");
        System.out.println("Withdrawals Left This Month: " + (withdrawalLimit - withdrawalsThisMonth));
    }

}

