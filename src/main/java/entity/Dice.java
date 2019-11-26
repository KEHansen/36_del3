package entity;

public class Dice {

    int i = 0;
    private int faces;
    private int faceValue;

    public Dice(int faces) {
        this.faces = faces;
    }

    public void roll() {
        faceValue = (int) (Math.random() * faces) + 1;
    }

    public void testRoll() {
        int[] test = {4,3,1,2};
        faceValue = test[i++];
        i = i % test.length;
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

    @Override
    public String toString() {
        return "Dice: " + faceValue;
    }
}
