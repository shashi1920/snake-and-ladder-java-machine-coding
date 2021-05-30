package board;


import entities.Item;

public class Board {

    Cell[][] cells;
    int maxRow;
    int maxCol;

    public Board() {
        cells = new Cell[10][10];
        maxRow = 10;
        maxCol = 10;
        for (int i = 0; i < maxRow; i++) {
            for (int j = 0; j < maxCol; j++) {
                cells[i][j] = new Cell(i * maxRow + j + 1);
            }
        }
    }

    Board(int row, int col) {

    }

    public boolean addItem(int cellValue, Item item) {
        return true;
    }

}
