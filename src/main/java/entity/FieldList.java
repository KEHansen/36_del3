package entity;

public class FieldList {
    private Field[] fields = new Field[12];

    public FieldList() {
        fields[0] = new  Field(1, "START", 2, "YOU GET 2M");
        //--------------------------------------------------------------------------------------
        fields[1] = new  Field(2, "BURGER JOINT", 1, "1M");
        fields[2] = new  Field(3, "PIZZA BAR", 1, "1M");
        //--------------------------------------------------------------------------------------
        fields[3] = new  Field(4, "CHANCE", 0, "CHANCE");
        //--------------------------------------------------------------------------------------
        fields[4] = new  Field(5, "CANDY SHOP", 1, "1M");
        fields[5] = new  Field(6, "IS-CREAM SHOP ", 1, "1M");
        //--------------------------------------------------------------------------------------
        fields[6] = new  Field(7, "JAIL", 0, "VISITING");
        //--------------------------------------------------------------------------------------
        fields[7] = new  Field(8, "MUSEUM", 2, "2M");
        fields[8] = new  Field(9, "LIRBARY", 2, "2M");
        //--------------------------------------------------------------------------------------
        fields[9] = new  Field(10, "CHANCE", 0, "CHANCE");
        //--------------------------------------------------------------------------------------
        fields[10] = new  Field(11, "SKATER PARK", 2, "2M");
        fields[11] = new  Field(12, "SWIMMING POOL", 2, "2M");
        //--------------------------------------------------------------------------------------
        fields[12] = new  Field(13, "FREE PARKING", 0, "FREE PARKING");
        //--------------------------------------------------------------------------------------
        fields[13] = new  Field(14, "ARCADE", 3, "3M");
        fields[14] = new  Field(15, "CHINEMA", 3, "3M");
        //--------------------------------------------------------------------------------------
        fields[15] = new  Field(16, "CHANCE", 0, "CHANCE");
        //--------------------------------------------------------------------------------------
        fields[16] = new  Field(17, "TOY STORE", 3, "3M");
        fields[17] = new  Field(18, "PET STORE", 3, "3M");
        //--------------------------------------------------------------------------------------
        fields[18] = new  Field(19, "GO TO JAIL", 0, "GO TO JAIL");  //** REMEBER ** <----------------------------------------------------------
        //--------------------------------------------------------------------------------------
        fields[19] = new  Field(20, "BOWLING ALLEY", 4, "4M");
        fields[20] = new  Field(21, "ZOO", 4, "4M");
        //--------------------------------------------------------------------------------------
        fields[21] = new  Field(22, "CHANCE", 0, "CHANCE");
        //--------------------------------------------------------------------------------------
        fields[22] = new  Field(23, "WATER PARK", 5, "5M");
        fields[23] = new  Field(24, "SEAFRONT", 5, "5M");

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
