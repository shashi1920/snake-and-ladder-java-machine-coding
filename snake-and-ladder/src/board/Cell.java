package board;

import java.util.List;
import java.util.Objects;

public class Cell {

    int value;
    Item item;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cell cell = (Cell) o;
        return value == cell.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public Cell(int value) {
        this.value = value;
    }
}
