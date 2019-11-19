package boundary;

import gui_main.GUI;

public class Input {

    private GUI gui;

    public Input(GUI gui) {
        this.gui = gui;
    }

    public int waitForInt(String s) {
        int temp = gui.getUserInteger(s);
        while (temp >= 2 && temp <= 4) {
            temp = gui.getUserInteger(s);
        }
        return temp;
    }

    public void waitForEnter() {
        gui.getUserButtonPressed("", "ENTER");
    }

    public String waitForString(String s) {
        return gui.getUserString(s);
    }

}
