package board;


import entities.Item;

import java.util.Arrays;

public class Board {

    Cell[][] cells;
    int maxRow;
    int maxCol;

    public Board() {
        this(10, 10);
    }

    public Board(int row, int col) {
        this.maxRow = row;
        this.maxCol = col;
        cells = new Cell[this.maxRow][this.maxCol];
        for (int i = 0; i < maxRow; i++) {
            for (int j = 0; j < maxCol; j++) {
                cells[i][j] = new Cell((i*maxCol)+j+1);
            }
        }
    }

    public boolean addItem(int cellValue, Item item) {
        getCell(cellValue).setItem(item);
        return true;
    }

    public Cell getCell(int value) {
        if (value >= maxRow*maxCol) {
            return cells[maxRow - 1][maxCol - 1];
        }
        int row = (value - 1) / maxRow;
        int col = (value - 1) % maxCol;
        return cells[row][col];
    }

}
