package boundary;

import entity.Field;
import gui_fields.GUI_Car;
import gui_fields.GUI_Field;
import gui_fields.GUI_Ownable;
import gui_fields.GUI_Player;
import gui_main.GUI;
import entity.Player;

public class MatadorGUI {

    private GUI gui;
    private GUI_Field[] guiFields;
    private GUI_Player[] players;
    private GUI_Car[] cars;


    public MatadorGUI(GUI gui) {
        this.gui = gui;
        this.guiFields= gui.getFields();
    }

    public void startInfo(Player[] p) {
        players = new GUI_Player[p.length];
        cars = new GUI_Car[p.length];
        for (int i=0; i<p.length;i++){
            cars[i] = new GUI_Car(p[i].getColor(), null, GUI_Car.Type.CAR, GUI_Car.Pattern.FILL);
            players[i] = new GUI_Player(p[i].getName(),p[i].getMoney(), cars[i]);
            gui.addPlayer(players[i]);
        }

        // sæt alle biler på start
        for (GUI_Player player : players){
            guiFields[0].setCar(player, true);
        }
    }

    public void showMessage(int no, String name) {
        gui.showMessage(String.format(Text.TEXT[no], name));
    }

    public void showMessageBuying(String name, String field) {
        gui.showMessage(String.format(Text.BUYINGTEXT[0], name, field));
    }

    public void showMessagePaying(String name, String field, String owner) {
        gui.showMessage(String.format(Text.PAYINGTEXT[0], name, field, owner));
    }

    public void showMessageOwnedByPlayer(String name, String field) {
        gui.showMessage(String.format(Text.OWNERTEXT[0], name, field));
    }

    public void showMessageChance(int no) {
        gui.showMessage(Text.CHANCETEXT[no]);
    }


    public void showGameStatus (Player[] p, Field[] f) {
        for (int i = 0; i < guiFields.length; i++) {
            if (guiFields[i] != null) {
                guiFields[i].removeAllCars();
                showOwnership(i, p, f);

            }
            for (int j = 0; j < p.length; j++) {
                // sæt biler og opdater balancer
                guiFields[p[j].getFieldIndex()].setCar(players[j], true);
                players[j].setBalance(p[j].getMoney());
            }

        }
    }

    public void waitingForPlayer(String name) {
        gui.showMessage(String.format(Text.TEXT[2], name));
    }

    public void waitingForEnter() {
        gui.getUserButtonPressed("", "ENTER");
    }


    public void showRoll(int faceValue) {
        gui.setDie(faceValue);
        
    }

    private void showOwnership(int i, Player[] p, Field[] f) {
        int owner = f[i].getOwnerID();
        if (owner != 0) {
            ((GUI_Ownable) guiFields[i]).setBorder(p[owner-1].getColor());
        }
    }


    public int guiChance(int chance) {
        int choice = 0;
        showMessageChance(chance);
        switch (chance) {
            case 2 :
                choice = gui.getUserInteger(Text.interactiveTEXT[0], 1, 5);
                break;
            case 3 :
                choice = gui.getUserInteger(Text.interactiveTEXT[1], 1, 2);
                break;
            case 4 :
                choice = gui.getUserInteger(Text.interactiveTEXT[2], 1, 2);
                break;
            case 6 :
                choice = gui.getUserInteger(Text.interactiveTEXT[3], 1, 2);
                break;
            case 7 :
                choice = gui.getUserInteger(Text.interactiveTEXT[4], 1, 2);
                break;
            case 11 :
                choice = gui.getUserInteger(Text.interactiveTEXT[5], 1, 2);
                break;
            case 12 :
                choice = gui.getUserInteger(Text.interactiveTEXT[6], 1, 2);
                break;
            default:
                break;
        }


        return choice;
    }
}
