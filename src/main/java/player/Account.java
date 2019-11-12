package player;

public class Account extends Player {

    public int balance;

    public Account(String name, int balance) {
        super(name);
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return getName() + "'s balance: " + balance + "M";
    }
}
