package logic;

import entity.FieldList;
import entity.Player;
import entity.PlayerList;

public class gameLogic {

    public gameLogic() {
    }

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
            p.setMoney(p.getMoney()+f.getField(0).getValue());

        switch (actual) {
            case 0 :
            case 6 :
            case 12 :
                break;
            case 18 :
                p.setInPrison(true);
                p.setFieldIndex((p.getFieldIndex()+faceValue)%f.getSize());
                break;
            case 3 :
            case 9 :
            case 15 :
            case 21 :
                break; //Chancekort
            default:
                checkField(turn, pl, f);
                break;
        }
    }






    private void checkField(int turn, PlayerList pl, FieldList f) {
        Player p = pl.getPlayer(turn);
        int owner = f.getField(p.getFieldIndex()).getOwnerID();

        switch (owner) {
            case 0 :
                p.setMoney(p.getMoney()-f.getField(p.getFieldIndex()).getValue());
                f.getField(p.getFieldIndex()).setOwnerID(turn + 1);
                break;
            case 1 :
            case 2 :
            case 3 :
            case 4 :
                p.setMoney(p.getMoney()-f.getField(p.getFieldIndex()).getValue());
                pl.getPlayer(owner - 1).setMoney(p.getMoney()+f.getField(p.getFieldIndex()).getValue());
                break;
        }


    }

}
