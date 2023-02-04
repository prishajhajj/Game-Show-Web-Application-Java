package sheridan.jhajjpr.assignment1;

import static java.lang.System.out;
import java.util.Random;

public class PlayGame {

    private final Random random;
    private int boxValue;

    public PlayGame(Random random) {
        this.random = random;
    }

    public int getValue( ) {
        return boxValue;
    }

    public final void setValue(int value) {
        if(value >= 1 && value <= 3) {
            this.boxValue = boxValue;
        }
        else {
            throw new IllegalArgumentException("Number of Boxes is not valid" + boxValue);
        }
    }



}
