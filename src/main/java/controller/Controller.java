package controller;

import boundary.Board;
import boundary.Input;
import entity.Dice;
import entity.Playerlist;
import gui_fields.GUI_Car;
import gui_fields.GUI_Player;
import gui_main.GUI;

import java.awt.*;
import java.util.Scanner;

public class Controller {
     public void playgame(){
         GUI gui = new GUI(Board.createBoard(), Color.cyan);

         int players = gui.getUserInteger("How many players are you?",2,4);
         Playerlist player = new Playerlist(players);



         gui.getUserString("please, choose player 1 name");

         //gui.addPlayer(); //Sæt spilleren på
         Input i = new Input();
         i.a



     }


}
