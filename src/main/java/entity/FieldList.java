package entity;

import java.awt.*;

public class FieldList {
    private Field[] fields = new Field[24];

    public FieldList() {
        fields[0] = new  Field(1, "START", 2, "YOU GET 2M", Color.WHITE);
        //--------------------------------------------------------------------------------------
        fields[1] = new  Field(2, "BURGER JOINT", 1, "1M", Color.GRAY);
        fields[2] = new  Field(3, "PIZZA BAR", 1, "1M", Color.GRAY);
        //--------------------------------------------------------------------------------------
        fields[3] = new  Field(4, "CHANCE", 0, "CHANCE", Color.WHITE);
        //--------------------------------------------------------------------------------------
        fields[4] = new  Field(5, "CANDY SHOP", 1, "1M", Color.PINK);
        fields[5] = new  Field(6, "IS-CREAM SHOP ", 1, "1M", Color.PINK);
        //--------------------------------------------------------------------------------------
        fields[6] = new  Field(7, "JAIL", 0, "VISITING", Color.WHITE);
        //--------------------------------------------------------------------------------------
        fields[7] = new  Field(8, "MUSEUM", 2, "2M", Color.MAGENTA);
        fields[8] = new  Field(9, "LIRBARY", 2, "2M", Color.MAGENTA);
        //--------------------------------------------------------------------------------------
        fields[9] = new  Field(10, "CHANCE", 0, "CHANCE", Color.WHITE);
        //--------------------------------------------------------------------------------------
        fields[10] = new  Field(11, "SKATER PARK", 2, "2M", Color.ORANGE);
        fields[11] = new  Field(12, "SWIMMING POOL", 2, "2M", Color.ORANGE);
        //--------------------------------------------------------------------------------------
        fields[12] = new  Field(13, "FREE PARKING", 0, "FREE PARKING", Color.WHITE);
        //--------------------------------------------------------------------------------------
        fields[13] = new  Field(14, "ARCADE", 3, "3M", Color.RED);
        fields[14] = new  Field(15, "CHINEMA", 3, "3M", Color.RED);
        //--------------------------------------------------------------------------------------
        fields[15] = new  Field(16, "CHANCE", 0, "CHANCE", Color.WHITE);
        //--------------------------------------------------------------------------------------
        fields[16] = new  Field(17, "TOY STORE", 3, "3M", Color.YELLOW);
        fields[17] = new  Field(18, "PET STORE", 3, "3M", Color.YELLOW);
        //--------------------------------------------------------------------------------------
        fields[18] = new  Field(19, "GO TO JAIL", 0, "GO TO JAIL", Color.WHITE);  //** REMEBER ** <----------------------------------------------------------
        //--------------------------------------------------------------------------------------
        fields[19] = new  Field(20, "BOWLING ALLEY", 4, "4M", Color.GREEN);
        fields[20] = new  Field(21, "ZOO", 4, "4M", Color.GREEN);
        //--------------------------------------------------------------------------------------
        fields[21] = new  Field(22, "CHANCE", 0, "CHANCE", Color.WHITE);
        //--------------------------------------------------------------------------------------
        fields[22] = new  Field(23, "WATER PARK", 5, "5M", Color.CYAN);
        fields[23] = new  Field(24, "SEAFRONT", 5, "5M", Color.CYAN);

    }

    public int getSize() {
        return fields.length;
    }

    public Field getField(int nr) {
        return fields[nr];
    }

    public String[][] getFieldText() {
        String[][] fieldText = new String[getSize()][2];

        for (int i=0; i<fields.length; i++) {
            fieldText[i][0] = fields[i].getName();
            fieldText[i][1] = "" + fields[i].getValue();

        }
        return fieldText;
    }
}
