package board;

public abstract class Player {
    String playerName;
    Dice dice;

    int getNextRoll() {
        return 0;
    }
}
