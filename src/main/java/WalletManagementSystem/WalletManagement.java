package WalletManagementSystem;

public class WalletManagement {
    private User Users;
    private Wallet Wallets;
    private Transaction Transactions;

    public WalletManagement(User users, Wallet wallets, Transaction transactions) {
        Users = users;
        Wallets = wallets;
        Transactions = transactions;
    }

    public User getUsers() {
        return Users;
    }

    public void setUsers(User users) {
        Users = users;
    }

    public Wallet getWallets() {
        return Wallets;
    }

    public void setWallets(Wallet wallets) {
        Wallets = wallets;
    }

    public Transaction getTransactions() {
        return Transactions;
    }

    public void setTransactions(Transaction transactions) {
        Transactions = transactions;
    }
    public void  userRegister ( Long id, String name, String email){

    }
}


