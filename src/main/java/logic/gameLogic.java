package logic;

public class gameLogic {

    public gameLogic() {
    }

    public int startBalance(int playerNum) {
        int balance = 0;
        switch (playerNum) {
            case 2: balance = 20; break;
            case 3: balance = 18; break;
            case 4: balance = 16; break;
        }
        return balance;
    }

}
