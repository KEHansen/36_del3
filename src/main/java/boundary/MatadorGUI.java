package boundary;

import entity.Field;
import gui_fields.GUI_Car;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_fields.GUI_Street;
import gui_main.GUI;

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



    public void StartText() {gui.showMessage(String.format(Text.TEXT[0]));}

    public void init() {

    }




}
