package board;


import entities.Dice;

public class Player {
    String playerName;
    Dice dice;

    Player(String playerName, Dice dice) {
        this.playerName = playerName;
        this.dice = dice;
    }
    public Player(String playerName){
        this.playerName = playerName;
    }

    int getNextRoll() {
        return 0;
    }

}
