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
    private GUI_Car.Type type;
    private GUI_Car.Pattern pattern;


    public MatadorGUI(GUI gui) {
        this.gui = gui;
        this.guiFields= gui.getFields();
    }

    public void startInfo(Player[] p) {
        players = new GUI_Player[p.length];
        cars = new GUI_Car[p.length];
        for (int i=0; i<p.length;i++){
            System.out.println(p[i]);
            System.out.println(p[i].getColor());
            cars[i] = new GUI_Car(p[i].getColor(), null,type.CAR , pattern.FILL);
            players[i] = new GUI_Player(p[i].getName(),p[i].getMoney(), cars[i]);
            System.out.println(players[i]);
            gui.addPlayer(players[i]);
        }
        // sæt alle biler på start
        for (int i = 0; i < players.length; i++)
            guiFields[0].setCar(players[i], true);
    }

    public void showMessage(String text) {
        gui.showMessage(String.format(text));
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

    public void StartText() {gui.showMessage(String.format(Text.TEXT[0]));}

    public void init() {

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

}
