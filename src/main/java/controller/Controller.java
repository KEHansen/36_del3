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
         int input, winner;
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

             if (p.isInJail()) {
                 if (p.isFreeOutOfJail())
                     matGUI.showMessage(6, name);
                 else {
                     matGUI.showMessage(3, name);
                 }
                 logic.getOutOfJail(p);
             }

             matGUI.waitingForPlayer(name);
             matGUI.waitingForEnter();
             d1.roll();
             matGUI.showRoll(d1.getFaceValue());

             //Game Logic
             logic.movePlayer(d1.getFaceValue(), turn, list, fieldList);

             matGUI.showGameStatus(list.getPlayers(), fieldList.getFields());

             if (p.isBuying()) {
                 matGUI.showMessageBuying(name, fieldList.getField(p.getFieldIndex()).getName());
             } else if (turn + 1 == fieldList.getField(p.getFieldIndex()).getOwnerID()) {
                 matGUI.showMessageOwnedByPlayer(name, fieldList.getField(p.getFieldIndex()).getName());
             } else if (p.isInJail()) {
                 matGUI.showMessage(8, name);
             } else if (fieldList.getField(p.getFieldIndex()).getOwnerID() != 0) {
                 matGUI.showMessagePaying(name, fieldList.getField(p.getFieldIndex()).getName(), list.getPlayer(fieldList.getField(p.getFieldIndex()).getOwnerID()-1).getName());
             }

             if (logic.landedOnChance) {
                 matGUI.showMessage(4, name);
                 input = matGUI.guiChance(logic.dragCard());
                 logic.chanceCards(list, turn, input, fieldList);
                 if (logic.drawanother) {
                     matGUI.showMessage(5, name);
                     input = matGUI.guiChance(logic.dragCard());
                     logic.chanceCards(list, turn, input, fieldList);
                 }
             }

             matGUI.showGameStatus(list.getPlayers(), fieldList.getFields());

             p.setBuying(false);

             if (logic.haveAnyoneLost(list)) {
                 break;
             }

             turn = (turn + 1) % playerNum;
         }

         winner = logic.findWinner(turn, fieldList, list);
         matGUI.showMessage(7, list.getPlayer(winner).getName());
     }
}
