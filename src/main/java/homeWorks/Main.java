package homeWorks;

public class Main {
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[5];
        accounts[0] = new SavingsAccount("Lala", 1000, 11, 2.5);
        accounts[1] = new SavingsAccount("Vusal", 2000, 12, 3.0);
        accounts[2] = new CurrentAccount("Ali", 1700, 21, 100);
        accounts[3] = new CurrentAccount("Ilqar", 1800, 22, 200);
        accounts[4] = new BankAccount("Senuber", 3000, 30); 


        for (BankAccount account : accounts) {
            account.displayInfo();
            System.out.println();
        }
        accounts[0].deposit(500); // SavingsAccount
        accounts[1].withdraw(300); // SavingsAccount
        accounts[2].deposit(200); // CurrentAccount
        accounts[3].withdraw(1800); // CurrentAccount

        accounts[0].transfer(accounts[1], 500);

        ((SavingsAccount)accounts[0]).applyInterest();
    }
}
