package entity;

import java.awt.*;

public class Playerlist {

    //ide fra lærers CDIO 2:

    private Player[] players;

    private int playersNum;

    private Color[] colorList = {Color.BLACK, Color.YELLOW, Color.BLUE, Color.GREEN};

    public Playerlist(int playersNum) {
        this.playersNum = playersNum;
        players = new Player[playersNum];
        for (int i = 0;i < playersNum;i++)
            players[i]=new Player(null, colorList[i]);
    }

    public int getPlayersNum() {
        return playersNum;
    }

    public Player[] getPlayers() {
        return players;
    }

    public Player getPlayer(int i){

        return players[i];
    }

//    public void addspiller(int antal){
//        String[i] name = {};
//        for (int i=0; i<playersNum;i++){
//            players[i].setName(navne[i]);
//            players[i].setColor(i);
//        }
 //   }
}
