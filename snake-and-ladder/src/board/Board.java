package board;


import entities.Item;

public class Board {

    Cell[][] cells;
    int maxRow;
    int maxCol;

    public Board() {
        this(10, 10);
    }

    public Board(int row, int col) {
        cells = new Cell[10][10];
        maxRow = row;
        maxCol = col;
        for (int i = 0; i < maxRow; i++) {
            for (int j = 0; j < maxCol; j++) {
                cells[i][j] = new Cell(i * maxRow + j + 1);
            }
        }
    }

    public boolean addItem(int cellValue, Item item) {
        return true;
    }

    public Cell getCell(int value){
        if(value > cells.length){
            // throw exception
        }


    }

}
