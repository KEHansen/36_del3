package controller;

import boundary.Board;
import boundary.MatadorGUI;
import entity.Dice;
import entity.FieldList;
import entity.Player;
import entity.PlayerList;

import gui_main.GUI;
import logic.gameLogic;


public class Controller {

     public void playGame(){

         FieldList fieldList = new FieldList();

         Board board = new Board();

         GUI gui = new GUI(board.createFields(fieldList.getFields()));

         MatadorGUI gui1 = new MatadorGUI(gui);

         gameLogic logic = new gameLogic();

         Dice d1 = new Dice(6);

         int playerNum = gui.getUserInteger("How many players are you?", 2,4);

         PlayerList list = new PlayerList(playerNum);

         for (int i = 0; i < list.getPlayersNum(); i++) {
             int no = i+1;
             String name = gui.getUserString("set player" + (no) + " " + "name");
             list.getPlayer(i).setName(name);
             list.getPlayer(i).setMoney(logic.startBalance(playerNum));
         }

         gui1.startInfo(list.getPlayers());

         gui1.showGameStatus(list.getPlayers());

         int turn = 0;
         Player p;
         String name;
         while (true) {
             p = list.getPlayer(turn);
             name = p.getName();
             gui1.waitingForPlayer(name);
             gui1.waitingForEnter();
             d1.roll();
             gui1.showRoll(d1.getFaceValue());

             //Game Logic
             logic.movePlayer(d1.getFaceValue(), turn, list, fieldList);

             gui1.showGameStatus(list.getPlayers());






             turn = (turn + 1) % playerNum;

         }
    }
}
