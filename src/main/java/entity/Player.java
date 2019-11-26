package entity;
import java.awt.*;

public class Player {
    private String name;
    private Color color;
    private int money;
    private int fieldIndex;
    private boolean haveLost;
    private boolean throwAgain;
    private boolean inPrison;

    public Player(String name, Color color) {
        //todo "Husk at argumentere for at vi har money, som en parameter."
        this.color = color;
        money=0;
        fieldIndex = 0;
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

    public void addMoney(int diff) { this.money =+ diff;}

    public boolean isHaveLost() {return haveLost;}

    public void setHaveLost(boolean haveLost) { this.haveLost = haveLost; }

    public boolean isThrowAgain(){return throwAgain;}

    public void setThrowAgain(boolean throwAgain) { this.throwAgain = throwAgain; }

    public int getFieldIndex() { return fieldIndex; }

    public void setFieldIndex(int fieldIndex) { this.fieldIndex = fieldIndex; }

    public boolean isInPrison(){return inPrison;}

    public  boolean setInPrison(boolean inPrison){return haveLost;}

    @Override
    public String toString() { return name; }

}

