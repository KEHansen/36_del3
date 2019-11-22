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
          //GUI gui = new GUI(Board.createBoard());







     }


}
