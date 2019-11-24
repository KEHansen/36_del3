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
    private GUI_Street[] streets;
    private GUI_Car.Type type;
    private GUI_Car.Pattern pattern;


    public MatadorGUI() { }

    public GUI_Street[] createStreets(Field[] fields) {
        for (int i = 0; i < fields.length; i++) {
            streets[i].setTitle(fields[i].getName());
            streets[i].setSubText(fields[i].getText());
            streets[i].setBackGroundColor(fields[i].getColor());
        }
        return streets;
    }

    public GUI_Field[] createFields(Field[] fields) {

        guiFields = new GUI_Field[fields.length];
        streets = new GUI_Street[fields.length];

        for (int i = 0; i < fields.length; i++) {
            streets[i] = new GUI_Street();
        }

        for (int i = 0; i < fields.length; i++) {
            streets[i].setTitle(fields[i].getName());
            streets[i].setSubText(fields[i].getText());
            streets[i].setBackGroundColor(fields[i].getColor());
            guiFields[i] = streets[i];
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
            // gui.addPlayer(players[i]);
        }
        // sæt alle biler på start
        for (int i = 0; i < players.length; i++)
            streets[0].setCar(players[i], true);
    }



    public void showGameStatus (Player [] p) {
        for (int i = 0; i < streets.length; i++) {
            if (streets[i] != null) {
                streets[i].removeAllCars();
            }
            for(int j = 0; j < p.length; j++){
                // sæt biler og opdater balancer
                streets[p[j].getFeltIndex()].setCar(players[j], true);
                players[j].setBalance(p[j].getMoney());
            }
        }
    }

    public void StartText() {gui.showMessage(String.format(Text.TEXT[0]));}

    public void init() {

    }




}
