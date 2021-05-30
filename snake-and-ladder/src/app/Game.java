package app;

import board.*;
import entities.Dice;
import entities.Item;
import item.Dice;
import item.Item;

import java.util.List;
import java.util.Map;

public class Game {

    Board board;
    List<Player> players;
    Map<Player, Cell> playerPosition;
    Dice dice = new Dice();

    Game(List<Player> players, List<Item> items) {
        if (players == null || players.isEmpty()) {
            //throw ex
        }
        this.players = players;
        for (Player player : this.players) {
            playerPosition.put(player, null);
        }
        board = new Board();

        if (items != null) {
            for (Item item : items) {
                board.addItem(item.getStartPos(), item);
            }
        }
    }

    public void nextTurn() {

    }

    public boolean isOver() {
        return false;
    }

    public Player getWinner() {
        return null;
    }


}
