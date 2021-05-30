package app;

import board.Board;
import board.Cell;
import board.Player;
import entities.Dice;
import entities.Item;

import java.util.List;
import java.util.Map;

public class Game {

    private final int MAX_ROW = 10;
    private final int MAX_COL = 10;
    Board board;
    List<Player> players;
    int totalTurn = 0;
    Map<Player, Cell> playerPosition;
    Dice dice = new Dice();

    Game(List<Player> players, List<Item> items) {
        if (players == null || players.isEmpty()) {
            //throw ex
        }
        for (Player player : players) {
            player.setDice(dice);
        }
        this.players = players;
        for (Player player : this.players) {
            playerPosition.put(player, null);
        }
        board = new Board(MAX_ROW, MAX_COL);

        if (items != null) {
            for (Item item : items) {
                board.addItem(item.getStartPos(), item);
            }
        }
    }

    public void nextTurn() {
        if(!isOver()){
            Player player = players.get(totalTurn % players.size());
            Cell currentCell = playerPosition.get(player);
            if(currentCell == null){
                board.get

            }




            totalTurn+=1;

        }
        else {
            System.out.println("Game is already Over");
        }

    }

    public boolean isOver() {
        return playerPosition.values().stream().filter(x -> x.getValue() == MAX_ROW * MAX_COL).findFirst().isPresent();
    }

    public Player getWinner() {
        return playerPosition.entrySet()
                .stream().filter(x -> x.getValue().getValue() == MAX_ROW * MAX_COL)
                .map(x -> x.getKey()).findFirst().orElse(null);
    }


}
