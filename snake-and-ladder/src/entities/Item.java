package entities;

public interface Item {
    String getName();

    int getStartPos();

    int getEndPos();

    default int getNextPos(int currPos) {
        return currPos == getStartPos() ? getEndPos() : currPos;
    }
    default String asString(){
        return getName() + " [" + getStartPos() + "," + getEndPos()+"]";
    }

}
