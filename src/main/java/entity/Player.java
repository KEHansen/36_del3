package entity;
import java.awt.*;

public class Player {
    private String name;
    private Color color;
    private int money;
    private int feltIndex;
    private boolean haveLost;
    private boolean throwAgain;
    private boolean inPrison;


    public Player(String name, Color color) {
        //todo "Husk at argumentere for at vi har money, som en parameter."
        money=0;
        feltIndex=0;
        haveLost=false;
        throwAgain=false;
        inPrison=false;
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public boolean isHaveLost() {return haveLost;}

    public void setHaveLost(boolean haveLost) { this.haveLost = haveLost; }

    public boolean isThrowAgain(){return throwAgain;}

    public void setThrowAgain(boolean throwAgain) { this.throwAgain = throwAgain; }

    public int getFeltIndex() { return feltIndex; }

    public void setFeltIndex(int feltIndex) { this.feltIndex = feltIndex; }

    public boolean isInPrison(){return inPrison;}

    public  boolean setInPrison(boolean inPrison){return haveLost;}

    @Override
    public String toString() { return name; }

}

