package app;

import board.Player;
import entities.Item;
import entities.Ladder;
import entities.Snake;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameRunner {


    static Scanner scanner = new Scanner(System.in);

    private static List<Item> inputItem(String name) {
        List<Item> items = new ArrayList<>();
        System.out.println(String.format("Enter number of %s", name));
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(String.format("Enter %s %s startPos<space>endPos", n, name));
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            int startPos = Integer.parseInt(line.split(" ")[0]);
            int endPos = Integer.parseInt(line.split(" ")[1]);
            if (name.equals("snake")) {
                items.add(new Snake(startPos, endPos));
            }
            if (name.equals("ladder")) {
                items.add(new Ladder(startPos, endPos));
            }
        }
        return items;
    }

    private static List<Player> inputPlayers() {
        List<Player> players = new ArrayList<>();
        System.out.println(String.format("Enter number of players"));
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println(String.format("Enter %s player name:", i + 1));
            String playerName = scanner.nextLine();
            players.add(new Player(playerName));
        }

        return players;
    }

    public static void main(String args[]) {
        List<Item> items = inputItem("snake");
        items.addAll(inputItem("ladder"));
        List<Player> players = inputPlayers();
        Game game = new Game(players, items);
        while (!game.isOver()) {
            game.nextTurn();
        }
        System.out.println("Winner is : " +game.getWinner().getName());
    }


}
