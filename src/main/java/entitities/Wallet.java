package entitities;


import java.util.ArrayList;
import java.util.List;

public class Wallet {

    private int id;
    private int balance;
    List<Transaction> transactions;

    public Wallet(int id, int balance) {
        this.id = id;
        this.balance = balance;
        this.transactions = new ArrayList<Transaction>();
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public List<Transaction> getTransactions(){
        return this.transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

}
