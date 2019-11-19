package entity;


import java.awt.*;

public class Playerlist {

    private Player[] players;

    public Playerlist(int playersNum) {
        players = new Player[playersNum];
        for (int i = 0; i < playersNum; i++)
            players[i] = new Player();
    }

        void p ( int i, String s){
            players[i].setName();
        }


    /**
     * tilf�jer harcoded spilere til spillerlisten
     * @param antal antal spillere der skal tilf�jes
     */
    public void addplayer(int antal){
        String[] navne = {};
        for (int i=0; i<antal;i++){
            players[i].setName(navne[i]);
            //Players[i].setColor();
        }
    }



}
