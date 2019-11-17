package controller;

import boundary.Board;
import entity.Playerlist;
import gui_main.GUI;

import java.awt.*;

public class Controller {
     public void playgame(){
         GUI gui = new GUI(Board.createBoard(), Color.cyan);

         gui.getUserInteger("How many players are you?",2,4);


     }


}
