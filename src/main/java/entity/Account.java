package entity;

import java.awt.*;

public class Account {

    private int balance;
    private boolean balanceZero;


    public Account(int balance) {
        this.balance = balance;
        balanceZero = false;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void addToBalance(int diff) {
        this.balance =+ diff;
    }

    public boolean isBalanceZero() {return balanceZero;}

    @Override
    public String toString() {
        return balance + "M";
    }
}
