// Accountacc.java
import java.util.ArrayList;
import java.util.List;

public class Accountacc {
    private double balance;
    private List<Transaction> transactionHistory;

    public Accountacc() {
        this.balance = 0.0;
        this.transactionHistory = new ArrayList<>();
    }

    public void deposit(double amount) {
        balance += amount;
        transactionHistory.add(new Transaction("Deposit", amount));
        System.out.println("Deposit successful. Current balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            transactionHistory.add(new Transaction("Withdraw", amount));
            System.out.println("Withdrawal successful. Current balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void printTransactionHistory() {
        for (Transaction transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }
}