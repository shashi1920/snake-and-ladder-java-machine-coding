package board;

import java.util.Random;

public class Dice {
    Random random = new Random();
    int low;
    int high;
    Dice dice = null;

    Dice() {
        this.low = 1;
        this.high = 6;
    }

    Dice(int low, int high) {
        this.low = low;
        this.high = high;
    }

    public int roll() {
        return random.nextInt(high - low) + low;
    }

}
