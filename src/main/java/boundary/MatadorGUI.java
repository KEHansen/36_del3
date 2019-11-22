package boundary;

import entity.Field;
import gui_fields.GUI_Car;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_fields.GUI_Street;
import gui_main.GUI;
import entity.Player;

public class MatadorGUI {

    private GUI gui;
    private GUI_Field[] guiFields;
    private GUI_Player[] players;
    private GUI_Car[] cars;
    private GUI_Street[] streets;

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
            cars[i] = new GUI_Car(); //car.setPrimaryColor(Color.YELLOW);
            players[i] = new GUI_Player(p[i].getName(),p[i].getMoney(), cars[i]);
            gui.addPlayer(players[i]);
        }
        // sæt alle biler på start
        for (int i = 0; i < players.length; i++)
            streets[0].setCar(players[i], true);
    }

    public void StartText() {gui.showMessage(String.format(Text.TEXT[0]));}

    public void init() {

    }




}
