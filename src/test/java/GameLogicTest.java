import logic.GameLogic;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameLogicTest {

    @Test
    public void drawCard() {
        //Tester at chancekortene har "lige stor" chance for at blive trukket.
        GameLogic logic = new GameLogic();

        for (int j = 0; j <1000; j++) {
            int occurrences = 10000;
            float[] arr = new float[17];
            int t;
            for (int i = 0; i < occurrences; i++) {
                t = logic.drawCard() - 1;
                arr[t] = arr[t] + 1;
            }
            for (int i = 0; i < 17; i++) {
                assertEquals(5.88, arr[i] / occurrences * 100, 1);
            }
        }
    }
}
