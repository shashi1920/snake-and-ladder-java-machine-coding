package board;

import java.util.List;
import java.util.Map;

public class Game {

    Board board;
    List<Player> players;
    Map<Player, Cell> playerPosition;
    Dice dice = new Dice();

    Game(List<Player> players, Map<Integer, Item> itemMap) {
        if (players == null || players.isEmpty()) {
            //throw ex
        }
        this.players = players;
        for (Player player : this.players) {
            playerPosition.put(player, null);
        }
        board = new Board();

        if (itemMap != null) {
            for (Map.Entry<Integer, Item> entry : itemMap.entrySet()) {
                board.addItem(entry.getKey(), entry.getValue());
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
