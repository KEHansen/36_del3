package logic;
import entity.FieldList;
import entity.Player;
import entity.PlayerList;

public class GameLogic {

    public boolean tie = false;

    public boolean landedOnChance = false;

    public boolean drawanother = false;

    private int chance, actual, previous;

    public int startBalance(int playerNum) {
        int balance = 0;
        switch (playerNum) {
            case 2: balance = 20; break;
            case 3: balance = 18; break;
            case 4: balance = 16; break;
        }
        return balance;
    }

    /**
     * @param faceValue: Værdien af terningesiden.
     * @param turn: Hvilken spillers tur det er.
     * @param pl: Liste af spillerne.
     * @param f: Liste af spillets felter.
     * @method movePlayer: Flytter spilleren og tjekker om spilleren passere start, og hvilken typefelt spilleren lander på.
     */
    public void movePlayer(int faceValue, int turn, PlayerList pl, FieldList f) {
        Player p = pl.getPlayer(turn);
        previous = p.getFieldIndex();
        p.setFieldIndex((p.getFieldIndex()+faceValue)%f.getSize());
        actual = p.getFieldIndex();
        if (actual < previous)
            p.addMoney(f.getField(0).getValue());

        switch (actual) {
            case 0 :
            case 6 :
            case 12 :
                break;
            case 18 :
                p.setInJail(true);
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


    /**
     * @param turn: Hvilken spillers tur det er.
     * @param pl: Liste af spillerne.
     * @param f: Liste af spillets felter.
     * @method checkField: Tjekker hvorvidt feltet en spiller er landet på er ejet af en anden spiller eller ej.
     */
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
                p.setBuying(true);
                break;
            case 1 :
            case 2 :
            case 3 :
            case 4 :
                if (neighborfield1 == owner || neighborfield2 == owner) {
                    pl.getPlayer(owner - 1).addMoney(f.getField(p.getFieldIndex()).getValue()*2);
                    p.addMoney(-f.getField(p.getFieldIndex()).getValue()*2);
                } else {
                    pl.getPlayer(owner - 1).addMoney(f.getField(p.getFieldIndex()).getValue());
                    p.addMoney(-f.getField(p.getFieldIndex()).getValue());
                }
                break;
        }
    }

    public void getOutOfJail(Player p) {
        if (p.isFreeOutOfJail())
            p.setFreeOutOfJail(false);
        else
            p.addMoney(-1);
        p.setInJail(false);
    }

    public int drawCard() {
        int amountOfCards = 17;
        chance = (int) (Math.random() * amountOfCards) + 1;
        return chance;
    }

    /**
     * @param turn: Hvilken spillers tur det er.
     * @param pl: Liste af spillerne.
     * @param input: Værdien af det input som spilleren har givet igennem GUI'en, når vedkommende skal træffe et valg.
     * @param f: Liste af spillets felter.
     * @method chanceCards: Udfører det chancekort som spilleren har trukket.
     */
    public void chanceCards(PlayerList pl, int turn, int input, FieldList f) {
        Player p = pl.getPlayer(turn);
        landedOnChance = false;

        switch (chance) {
            case 1:
                // ryk til start
                p.setFieldIndex(0);
                p.addMoney(2);
                break;
            case 2:
                movePlayer(input, turn, pl, f);
                break;
            case 3:
                choseFieldLogic(pl, turn, input, f, p, 10, 11);
                break;
            case 4:
                if (input == 1) {
                    p.setFieldIndex(p.getFieldIndex() + 1);
                    checkField(turn, pl, f);
                } else {
                    drawanother = true;
                }
                break;
            case 5:
                p.addMoney(-2);
                break;
            case 6:
                choseFieldLogic(pl, turn, input, f, p, 19, 20);
                break;
            case 7:
                choseFieldLogic(pl, turn, input, f, p, 4, 5);
                break;
            case 8:
                p.setFreeOutOfJail(true);
                break;
            case 9:
                previous = p.getFieldIndex();
                p.setFieldIndex(23);
                actual = p.getFieldIndex();
                if (actual < previous)
                    p.addMoney(f.getField(0).getValue());
                checkField(turn, pl, f);
                break;
            case 10:
                p.addMoney(pl.getPlayersNum());
                for (int i = 0; i < pl.getPlayersNum() ; i++) {
                    pl.getPlayers()[i].addMoney(-1);
                }
                break;
            case 11:
                choseFieldLogic(pl, turn, input, f, p, 7, 8);
                break;
            case 12:
                choseFieldLogic(pl, turn, input, f, p, 22, 23);
                break;
            case 13:
                p.addMoney(2);
                break;
            case 14:
                choseFieldLogic(pl, turn, input, f, p, 13, 14);
                break;
            case 15:
                previous = p.getFieldIndex();
                p.setFieldIndex(10);
                actual = p.getFieldIndex();
                if (f.getField(10).getOwnerID() == 0)
                    f.getField(10).setOwnerID(turn + 1);
                else
                    checkField(turn, pl, f);
                break;
            case 16:
                choseFieldLogic(pl, turn, input, f, p, 16, 17);
                break;
            case 17:
                choseFieldLogic(pl, turn, input, f, p, 1, 2);
                break;

        }

    }

    /**
     * @method choseFieldLogic: Bruger inputet fra tidligere til at bestemme hvor spilleren skal flytte hen.
     */
    private void choseFieldLogic(PlayerList pl, int turn, int input, FieldList f, Player p, int no1, int no2) {
        if (input == 1) {
            previous = p.getFieldIndex();
            p.setFieldIndex(no1);
            actual = p.getFieldIndex();
            if (actual < previous)
                p.addMoney(f.getField(0).getValue());
            checkField(turn, pl, f);
        } else {
            previous = p.getFieldIndex();
            p.setFieldIndex(no2);
            actual = p.getFieldIndex();
            if (actual < previous)
                p.addMoney(f.getField(0).getValue());
            checkField(turn, pl, f);
        }
    }


    public int findWinner(FieldList fl, PlayerList pl) {
        Player[] p = pl.getPlayers();
        int[] results = new int[p.length];

        for (int i = 0; i < p.length; i++) {
            results[i] = p[i].getMoney();
        }
        sortResults(results);

        if (results[results.length - 1] == results[results.length - 2]) {
            tie = true;
        } else {
            for (int i = 0; i < p.length; i++) {
                if (p[i].getMoney() == results[results.length - 1]) {
                    return i;
                }
            }
        }
        return 0;
    }

    public boolean haveAnyoneLost(PlayerList pl) {
        boolean haveAnyoneLost = false;
        for (int i = 0; i <pl.getPlayersNum() ; i++) {
            if (pl.getPlayer(i).isHaveLost())
                haveAnyoneLost = true;
        }
        return haveAnyoneLost;
    }

    public int propertyCount(PlayerList pl, FieldList fl) {
        int[] results = new int[pl.getPlayersNum()];

        for (int i = 0; i < pl.getPlayersNum(); i++) {
            results[i] = pl.getPlayer(i).getMoney();
        }
        for (int i = 0; i < fl.getSize(); i++) {
            if (fl.getField(i).getOwnerID() != 0) {
                results[fl.getField(i).getOwnerID() - 1] = results[fl.getField(i).getOwnerID() - 1] + fl.getField(i).getValue();
            }
        }
        sortResults(results);
        for (int i = 0; i < pl.getPlayersNum(); i++) {
            if (pl.getPlayer(i).getMoney() == results[results.length - 1]) {
                return i;
            }
        }

        return 0;
    }

    private void sortResults(int[] results) {
        int temp;
        for (int i = 1; i < results.length; i++) {
            if (results[i - 1] > results[i]) {
                temp = results[i - 1];
                results[i - 1] = results[i];
                results[i] = temp;
            }
        }
    }

}
