package controller;

import boundary.Board;
import boundary.Input;
import boundary.MatadorGUI;
import entity.*;
import gui_fields.GUI_Car;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_fields.GUI_Street;
import gui_main.GUI;

import java.awt.*;
import java.util.Scanner;


public class Controller {

    public void playgame() {

        FieldList fieldList = new FieldList();

        GUI gui = new GUI(createFields(fieldList.getFields()));

        MatadorGUI gui1 = new MatadorGUI(gui);

        int playerNum = gui.getUserInteger("How many players are you?", 2, 4);

        Playerlist list = new Playerlist(playerNum);

        for (int i = 0; i < list.getPlayersNum(); i++) {
            int no = i + 1;
            String name = gui.getUserString("set player" + (no) + " " + "name");
            list.getPlayer(i).setName(name);
        }

        for (int i = 0; i < list.getPlayersNum(); i++) {
            if (list.getPlayersNum() == 4) {
                for (i = 0; i < list.getPlayers().length; i++) {
                    list.getPlayer(i).setMoney(16);
                }
            }

            if (playerNum == 3) {
                for (i = 0; i < list.getPlayers().length; i++) {
                    list.getPlayer(i).setMoney(18);
                }
            }


            if (playerNum == 2) {
                for (i = 0; i < list.getPlayers().length; i++) {
                    list.getPlayer(i).setMoney(20);
                }
            }

            gui1.startInfo(list.getPlayers());

            gui1.showGameStatus(list.getPlayers());
        }
    }


        public GUI_Field[] createFields (Field[]fields){

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

