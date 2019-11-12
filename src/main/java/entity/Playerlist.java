package entity;

public class Playerlist {

    private Player[] Players;

    public Playerlist(int Account) {
        Players = new Player[Account];
        for (int i = 0;i < antal;i++)
            spillere[i] = new Spiller();
    }

    /**
     * tilf�jer harcoded spilere til spillerlisten
     * @param antal antal spillere der skal tilf�jes
     */
    public void addspiller(int antal){
        String[] navne = ;
        for (int i=0; i<antal;i++){
            spillere[i].setNavn(navne[i]);
            spillere[i].setColor(i);
        }
    }



}
