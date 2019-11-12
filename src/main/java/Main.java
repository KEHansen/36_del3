import boundary.Board;
import gui_main.GUI;

public class Main {
    public static void main(String[] args) {
        GUI.setNull_fields_allowed(true);
        Board board = new Board();
        board.createBoard();
    }
}
