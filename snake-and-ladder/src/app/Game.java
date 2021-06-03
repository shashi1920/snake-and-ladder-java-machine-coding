package app;

import board.Board;
import board.Cell;
import board.Player;
import entities.Dice;
import entities.Item;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Game {

    private final int maxRow = 10;
    private final int maxCol = 10;
    Board board;
    List<Player> players;
    int totalTurn = 0;
    Map<Player, Cell> playerPosition;
    Dice dice = new Dice();

    Game(List<Player> players, List<Item> items) {
        playerPosition = new HashMap<>();
        if (players == null || players.isEmpty()) {
            //throw ex
        }
        this.players = players;
        for (Player player : this.players) {
            playerPosition.put(player, null);
        }
        board = new Board(maxRow, maxCol);

        if (items != null) {
            for (Item item : items) {
                board.addItem(item.getStartPos(), item);
            }
        }
    }

    public void nextTurn() {
        if (!isOver()) {
            Player player = players.get(totalTurn % players.size());
            Cell currentCell = playerPosition.get(player);
            int roll = dice.roll();
            System.out.println(player.getName() + " rolled " + roll);
            Cell nextCell = board.getCell(currentCell == null ? roll : currentCell.getValue() + roll);
            while (nextCell.getItem() != null) {
                System.out.println("encountered " + nextCell.getItem().asString());
                nextCell = board.getCell(nextCell.getItem().getNextPos(nextCell.getValue()));
            }
            System.out.println(String.format("%s moved from %s to %s", player.getName(), currentCell != null ? currentCell.getValue() : 0, nextCell.getValue()));
            playerPosition.put(player,nextCell);
            totalTurn += 1;

        } else {
            System.out.println("Game is already Over");
        }

    }

    public boolean isOver() {
        return playerPosition.values().stream().filter(Objects::nonNull).anyMatch(x -> x.getValue() == maxRow * maxCol);
    }

    public Player getWinner() {
        return playerPosition.entrySet()
                .stream().filter(x -> x != null && x.getValue().getValue() == maxRow * maxCol)
                .map(x -> x.getKey()).findFirst().orElse(null);
    }


}
