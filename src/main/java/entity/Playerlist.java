package entity;


public class Playerlist {

    private Player[] Players;

    public Playerlist(int players) {
        Players = new Player[players];
        for (int i = 0;i < players; i++)
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
