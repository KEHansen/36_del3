package logic;

import boundary.Text;
import entity.Field;
import entity.FieldList;
import entity.Player;
import entity.PlayerList;

public class ChanceCardLogic extends gameLogic {

    private int chance;

    public int dragCard() {
        chance = (int) (Math.random() * chance) + 1;
        return chance;
    }

    public void chanceCards(PlayerList pl, int turn, int input) {
        Player p = pl.getPlayer(turn);

        switch (chance) {

            case 1:
                // ryk til start
                p.setFieldIndex(0);
                p.addMoney(2);
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
            case 7:

                break;
            case 8:

                break;
            case 9:

                break;
            case 10:

                break;
            case 11:

                break;
            case 12:

                break;
            case 13:

                break;
            case 14:

                break;
            case 15:

                break;
            case 16:

                break;
            case 17:

                break;
            case 18:

                break;
            case 19:

                break;
            case 20:

        }

    }

}


