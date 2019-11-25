package controller;

import boundary.MatadorGUI;
import entity.Field;
import entity.FieldList;
import entity.Playerlist;
import gui_fields.GUI_Field;
import gui_fields.GUI_Street;
import gui_main.GUI;
import logic.gameLogic;


public class Controller {

     public void playgame(){

         FieldList fieldList = new FieldList();

         GUI gui = new GUI(createFields(fieldList.getFields()));

         MatadorGUI gui1 = new MatadorGUI(gui);

         gameLogic logic = new gameLogic();

         int playerNum = gui.getUserInteger("How many players are you?", 2,4);

         Playerlist list = new Playerlist(playerNum);

         for (int i = 0; i < list.getPlayersNum(); i++) {
             int no = i+1;
             String name = gui.getUserString("set player" + (no) + " " + "name");
             list.getPlayer(i).setName(name);
             list.getPlayer(i).setMoney(logic.startBalance(playerNum));
             // System.out.println(list.getPlayer(i).getColor());
         }

         gui1.startInfo(list.getPlayers());

         gui1.showGameStatus(list.getPlayers());




    }

    public GUI_Field[] createFields(Field[] fields) {

        GUI_Field[] guiFields = new GUI_Field[fields.length];

        for (int i = 0; i < fields.length; i++) {
            guiFields[i] = new GUI_Street();
        }

        for (int i = 0; i < fields.length; i++) {
            guiFields[i].setTitle(fields[i].getName());
            guiFields[i].setSubText(fields[i].getText());
            guiFields[i].setBackGroundColor(fields[i].getColor());
            guiFields[i] = guiFields[i];
        }
        return guiFields;
    }
}
