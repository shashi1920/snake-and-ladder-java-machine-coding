package board;

public interface Item {
    String getName();

    int getStartPos();

    int getEndPos();

    default int getNextPos(int currPos) {
        return currPos == getStartPos() ? getEndPos() : currPos;
    }

}
