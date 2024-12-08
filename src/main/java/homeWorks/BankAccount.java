package homeWorks;

public class BankAccount {
        private String accountHolder;
        public double balance;
        private int accountNumber;


        public BankAccount(String accountHolder, double balance, int accountNumber) {
            this.accountHolder = accountHolder;
            this.balance = balance;
            this.accountNumber = accountNumber;
        }


        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println(amount + " deposited to account.");
            } else {
                System.out.println("Invalid deposit amount.");
            }
        }


        public void withdraw(double amount) {
            if (amount > balance) {
                System.out.println("Insufficient funds.");
            } else {
                balance -= amount;
                System.out.println(amount + " withdrawn from account.");
            }
        }


        public void displayInfo() {
            System.out.println("Account Holder: " + accountHolder);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
        }


        public void transfer(BankAccount recipient, double amount) {
            if (amount <= balance) {
                this.balance -= amount;
                recipient.balance += amount;
                System.out.println(amount + " transferred to account " + recipient.accountNumber);
            } else {
                System.out.println("Insufficient funds for transfer.");
            }
        }
    }


