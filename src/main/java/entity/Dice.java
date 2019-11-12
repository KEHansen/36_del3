package entity;

public class Dice {

    private int faces;
    private int faceValue;

    public Dice(int faces) {
        this.faces = faces;
    }

    public void roll() {
        faceValue = (int) (Math.random() * faces) + 1;
    }

    public int getFaces() {
        return faces;
    }

    public void setFaces(int faces) {
        this.faces = faces;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }
}
