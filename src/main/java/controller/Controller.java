package controller;

import boundary.Board;
import boundary.Input;
import boundary.MatadorGUI;
import entity.Dice;
import entity.Field;
import entity.FieldList;
import entity.Playerlist;
import gui_fields.GUI_Car;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;

import java.awt.*;
import java.util.Scanner;


public class Controller {

     public void playgame(){


          FieldList fieldList = new FieldList();

          MatadorGUI gui1 = new MatadorGUI();

          GUI gui = new GUI(gui1.createFields(fieldList.getFields()));

          int playerNum = gui.getUserInteger("How many players are you?", 2,4);

          Playerlist list = new Playerlist(playerNum);

          for (int i = 0; i < list.getPlayersNum(); i++) {
                int no = i+1;
              String name = gui.getUserString("set player" + (no) + " " + "name");
               list.getPlayer(i).setName(name);
              System.out.println(list.getPlayer(i).getColor());
          }

         gui1.startInfo(list.getPlayers());

          gui1.showGameStatus(list.getPlayers());



    }

}
