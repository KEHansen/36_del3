package boundary;
import gui_fields.GUI_Field;
import gui_fields.GUI_Street;
import java.awt.*;

public class Board {

    public static GUI_Field[] createBoard() {
        GUI_Field[] fields = new GUI_Field[24];

        GUI_Street start = new GUI_Street();
        start.setTitle("START");
        start.setSubText("YOU GET 2M");
        start.setBackGroundColor(Color.white);
        fields[0] = start;

        //______________________________________//

        GUI_Street street1 = new GUI_Street();
        street1.setTitle("BURGER JOINT");
        street1.setSubText("1M");
        street1.setBackGroundColor(Color.gray);
        fields[1] = street1;

        GUI_Street street2 = new GUI_Street();
        street2.setTitle("PIZZA BAR");
        street2.setSubText("1M");
        street2.setBackGroundColor(Color.gray);
        fields[2] = street2;

        //______________________________________//

        GUI_Street street3 = new GUI_Street();
        street3.setTitle("CHANCE");
        street3.setBackGroundColor(Color.white);
        street3.setSubText("CHANCE");
        fields[3] = street3;

        //______________________________________//

        GUI_Street street4 = new GUI_Street();
        street4.setTitle("CANDY SHOP");
        street4.setSubText("1M");
        street4.setBackGroundColor(Color.pink);
        fields[4] = street4;

        GUI_Street street5 = new GUI_Street();
        street5.setTitle("PIZZA BAR");
        street5.setSubText("1M");
        street5.setBackGroundColor(Color.pink);
        fields[5] = street5;

        //______________________________________//

        GUI_Street street6 = new GUI_Street();
        street6.setTitle("JAIL");
        street6.setSubText("VISITING");
        street6.setBackGroundColor(Color.white);
        fields[6] = street6;

        //______________________________________//

        GUI_Street street7 = new GUI_Street();
        street7.setTitle("MUSEUM");
        street7.setSubText("2M");
        street7.setBackGroundColor(Color.magenta);
        fields[7] = street7;

        GUI_Street street8 = new GUI_Street();
        street8.setTitle("LIRBARY");
        street8.setSubText("2M");
        street8.setBackGroundColor(Color.magenta);
        fields[8] = street8;

        //______________________________________//

        GUI_Street street9 = new GUI_Street();
        street9.setTitle("CHANCE");
        street9.setBackGroundColor(Color.white);
        street9.setSubText("CHANCE");
        fields[9] = street9;

        //______________________________________//

        GUI_Street street10 = new GUI_Street();
        street10.setTitle("SKATER PARK");
        street10.setSubText("2M");
        street10.setBackGroundColor(Color.orange);
        fields[10] = street10;

        GUI_Street street11 = new GUI_Street();
        street11.setTitle("SWIMMING POOL");
        street11.setSubText("2M");
        street11.setBackGroundColor(Color.orange);
        fields[11] = street11;

        //______________________________________//

        GUI_Street street12 = new GUI_Street();
        street12.setTitle("FREE PARKING");
        street12.setBackGroundColor(Color.white);
        street12.setSubText("");
        fields[12] = street12;

        //______________________________________//

        GUI_Street street13 = new GUI_Street();
        street13.setTitle("ARCADE");
        street13.setSubText("3M");
        street13.setBackGroundColor(Color.red);
        fields[13] = street13;

        GUI_Street street14 = new GUI_Street();
        street14.setTitle("CHINEMA");
        street14.setSubText("3M");
        street14.setBackGroundColor(Color.red);
        fields[14] = street14;

        //______________________________________//

        GUI_Street street15 = new GUI_Street();
        street15.setTitle("CHANCE");
        street15.setBackGroundColor(Color.white);
        street15.setSubText("CHANCE");
        fields[15] = street15;

        //______________________________________//

        GUI_Street street16 = new GUI_Street();
        street16.setTitle("TOY STORE");
        street16.setSubText("3M");
        street16.setBackGroundColor(Color.yellow);
        fields[16] = street16;

         GUI_Street street17 = new GUI_Street();
        street17.setTitle("PET STORE");
        street17.setSubText("3M");
        street17.setBackGroundColor(Color.yellow);
        fields[17] = street17;

        //______________________________________//

        //** REMEBER ** <----------------------------------------------------------
        GUI_Street street18 = new GUI_Street();
        street18.setTitle("GO TO JAIL!");
        street18.setBackGroundColor(Color.white);
        street18.setSubText("");
        fields[18] = street18;

        //______________________________________//

        GUI_Street street19 = new GUI_Street();
        street19.setTitle("BOWLING ALLEY");
        street19.setSubText("4M");
        street19.setBackGroundColor(Color.green);
        fields[19] = street19;

        GUI_Street street20 = new GUI_Street();
        street20.setTitle("ZOO");
        street20.setSubText("4M");
        street20.setBackGroundColor(Color.green);
        fields[20] = street20;

        //______________________________________//

        GUI_Street street21 = new GUI_Street();
        street21.setTitle("CHANCE");
        street21.setBackGroundColor(Color.white);
        street21.setSubText("CHANCE");
        fields[21] = street21;

        //______________________________________//

        GUI_Street street22 = new GUI_Street();
        street22.setTitle("WATER PARK");
        street22.setSubText("5M");
        street22.setBackGroundColor(Color.cyan);
        fields[22] = street22;

        GUI_Street street23 = new GUI_Street();
        street23.setTitle("SEAFRONT");
        street23.setSubText("5M");
        street23.setBackGroundColor(Color.cyan);
        fields[23] = street23;

        //______________________________________//

        return fields;
    }
}
