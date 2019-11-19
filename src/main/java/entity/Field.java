package entity;

import java.awt.*;

public class Field {
    private int nr;
    private String name;
    private int value;
    private String text;
    private Color color;

    public Field(int nr, String name, int value, String text, Color color) {
        this.nr = nr;
        this.name = name;
        this.value = value;
        this.text = text;
        this.color = color;
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

    public void setValue(int value) {
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
