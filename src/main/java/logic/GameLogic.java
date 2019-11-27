package logic;

import entity.Field;
import entity.FieldList;
import entity.Player;
import entity.PlayerList;

public class gameLogic {

    public boolean propertyCount = false;

    public boolean landedOnChance = false;

    public int startBalance(int playerNum) {
        int balance = 0;
        switch (playerNum) {
            case 2: balance = 20; break;
            case 3: balance = 18; break;
            case 4: balance = 16; break;
        }
        return balance;
    }

    public void movePlayer(int faceValue, int turn, PlayerList pl, FieldList f) {
        Player p = pl.getPlayer(turn);
        int previous = p.getFieldIndex();
        p.setFieldIndex((p.getFieldIndex()+faceValue)%f.getSize());
        int actual = p.getFieldIndex();
        if (actual < previous)
            p.addMoney(f.getField(0).getValue());

        switch (actual) {
            case 0 :
            case 6 :
            case 12 :
                break;
            case 18 :
                p.setInPrison(true);
                p.setFieldIndex(6);
                break;
            case 3 :
            case 9 :
            case 15 :
            case 21 :
                landedOnChance = true;
                break; //Chancekort
            default:
                checkField(turn, pl, f);
                break;
        }

    }


    private void checkField(int turn, PlayerList pl, FieldList f) {
        Player p = pl.getPlayer(turn);
        int owner = f.getField(p.getFieldIndex()).getOwnerID();

        //Finds the owner for the neighboring fields
        int neighborfield1 = f.getField((p.getFieldIndex()+1)%f.getSize()).getOwnerID();
        int neighborfield2 = f.getField((p.getFieldIndex()-1)%f.getSize()).getOwnerID();

        switch (owner) {
            case 0 :
                p.addMoney(-f.getField(p.getFieldIndex()).getValue());
                f.getField(p.getFieldIndex()).setOwnerID(turn + 1);
                break;
            case 1 :
            case 2 :
            case 3 :
            case 4 :
                if (neighborfield1 == owner || neighborfield2 == owner) {
                    p.addMoney(-f.getField(p.getFieldIndex()).getValue()*2);
                    pl.getPlayer(owner - 1).addMoney(f.getField(p.getFieldIndex()).getValue()*2);
                } else {
                    p.addMoney(-f.getField(p.getFieldIndex()).getValue());
                    pl.getPlayer(owner - 1).addMoney(f.getField(p.getFieldIndex()).getValue());
                }
                break;
        }
    }

    public void getOutOfPrison(Player p) {
            p.addMoney(-1);
    }

    public void chance() {

    }

    public int findWinner(int losingPlayer, FieldList fl, PlayerList pl) {
        Player[] p = pl.getPlayers();
        Field[] f = fl.getFields();
        int[] results = new int[p.length];

        for (int i = 0; i < p.length; i++) {
            results[i] = p[i].getMoney();
        }
        int temp;
        for (int i = 1; i < results.length; i++) {
            if (results[i - 1] > results[i]) {
                temp = results[i - 1];
                results[i - 1] = results[i];
                results[i] = temp;
            }
        }

        if (results[results.length - 1] == results[results.length - 2]) {
            propertyCount = true;
        } else {
            for (int i = 0; i < p.length; i++) {
                if (p[i].getMoney() == results[results.length - 1]) {
                    return i;
                }
            }
        }
        //todo propertyCount
        return 0;
    }



}
