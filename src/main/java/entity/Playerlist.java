package entity;

import java.awt.*;

public class Playerlist {

    //ide fra lærers CDIO 2:

    private Player[] players;
    private Color[] colorList = {Color.BLACK, Color.YELLOW, Color.BLUE, Color.GREEN};

    public Playerlist(int playersNum) {
        players= new Player[playersNum];
        for (int i = 0;i < playersNum;i++)
            players[i]=new Player(null, colorList[i]);
    }
}
