package boundary;

import entity.Field;
import entity.Playerlist;
import gui_fields.GUI_Car;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_fields.GUI_Street;
import gui_main.GUI;
import entity.Player;

import java.awt.*;

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

    public GUI_Field[] createField(Field[] fields) {
                for (int i = 0; i < fields.length; i++) {
                    guiFields[i].setTitle(fields[i].getName());
                    guiFields[i].setSubText(fields[i].getText());
                    guiFields[i].setBackGroundColor(fields[i].getColor());
        }
        return guiFields;
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



    public void showGameStatus (Player [] p) {
        for (int i = 0; i < guiFields.length; i++) {
            if (guiFields[i] != null) {
                guiFields[i].removeAllCars();
            }
            for (int j = 0; j < p.length; j++) {
                // sæt biler og opdater balancer
                guiFields[p[j].getFeltIndex()].setCar(players[j], true);
                players[j].setBalance(p[j].getMoney());
            }
        }
    }

    public void StartText() {gui.showMessage(String.format(Text.TEXT[0]));}

    public void init() {

    }

}
