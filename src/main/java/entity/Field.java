package entity;

public class Field {
    private int nr;
    private String name;
    private int value;
    private String text;

    public Field(int nr, String name, int value, String text) {
        this.nr = nr;
        this.name = name;
        this.value = value;
        this.text = text;
    }

    // empty text
    public Field(int nr, String name, int value) { this(nr, name, value, ""); }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValuei(int value) {
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
