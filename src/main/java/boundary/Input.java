package boundary;
import controller.Controller;
import entity.Player;
import gui_fields.GUI_Player;
import gui_main.GUI;

public class Input {
GUI gui = new GUI();
    public void addPlayer (Player p) {
        gui.addPlayer(new GUI_Player(p.getName()));
    }

}
