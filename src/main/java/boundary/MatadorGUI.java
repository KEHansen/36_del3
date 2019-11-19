package boundary;

import gui_fields.GUI_Car;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;

public class MatadorGUI {

    private GUI gui;
    private GUI_Field[] fields;
    private GUI_Player[] players;
    private GUI_Car[] cars;

    public MatadorGUI(GUI gui) {
        this.gui = gui;
        this.fields = gui.getFields();
    }

    public void StartText() {gui.showMessage(String.format(Text.TEXT[0]));}

    public void init() {

    }




}
