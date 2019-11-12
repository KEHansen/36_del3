package entity;
import java.util.Scanner;

public class Playerlist {

    private Player[] Players;

    public Playerlist(int amount) {
        Players = new Player[amount];
        for (int i = 0;i < amount;i++)
            Players[i] = new Player();
    }

    /**
     * tilf�jer harcoded spilere til spillerlisten
     * @param antal antal spillere der skal tilf�jes
     */
    public void addspiller(int antal){
        String[] navne = {};
        for (int i=0; i<antal;i++){
            Players[i].setName(navne[i]);
            Players[i].setColor(i);
        }
    }



}
