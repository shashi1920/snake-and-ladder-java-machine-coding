package board;


import entities.Dice;

public class Player {
    String playerName;
    Dice dice;

    Player(String playerName, Dice dice) {
        this.playerName = playerName;
        this.dice = dice;
    }

    public String getPlayerName() {
        return playerName;
    }

    public Player(String playerName){
        this.playerName = playerName;
    }

    public void setDice(Dice dice) {
        this.dice = dice;
    }

    int getNextRoll() {
        return 0;
    }

}
