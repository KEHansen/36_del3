package controller;

import boundary.Board;
import boundary.MatadorGUI;
import boundary.Text;
import entity.Dice;
import entity.FieldList;
import entity.Player;
import entity.PlayerList;
import gui_main.GUI;
import logic.GameLogic;
import java.awt.Color;


public class Controller {

     public void playGame(){

         FieldList fieldList = new FieldList();

         Board board = new Board();

         GUI gui = new GUI(board.createFields(fieldList.getFields()), Color.LIGHT_GRAY);

         MatadorGUI matGUI = new MatadorGUI(gui);

         GameLogic logic = new GameLogic();

         Dice d1 = new Dice(6);

         int playerNum = gui.getUserInteger(Text.TEXT[0], 2,4);
         int input;
         PlayerList list = new PlayerList(playerNum);

         for (int i = 0; i < list.getPlayersNum(); i++) {
             int no = i+1;
             String name = gui.getUserString(String.format(Text.TEXT[1], no));
             list.getPlayer(i).setName(name);
             list.getPlayer(i).setMoney(logic.startBalance(playerNum));
         }

         matGUI.startInfo(list.getPlayers());

         matGUI.showGameStatus(list.getPlayers(), fieldList.getFields());

         int turn = 0;
         Player p;
         String name;

         while (true) {
             p = list.getPlayer(turn);
             name = p.getName();

             if (p.isInPrison()) {
                 matGUI.showMessage(3, name);
                 logic.getOutOfPrison(p);
             }

             matGUI.waitingForPlayer(name);
             matGUI.waitingForEnter();
             d1.testRoll();
             matGUI.showRoll(d1.getFaceValue());

             //Game Logic
             logic.movePlayer(d1.getFaceValue(), turn, list, fieldList);

             matGUI.showGameStatus(list.getPlayers(), fieldList.getFields());

             if (logic.landedOnChance) {
                 matGUI.showMessage(0, name);
                 input = matGUI.guiChance(logic.dragCard());
                 logic.chanceCards(list, turn, input, fieldList);


             }

             if (p.isHaveLost())
                 break;

             turn = (turn + 1) % playerNum;
         }

         logic.findWinner(turn, fieldList, list);

    }
}
