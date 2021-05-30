package entities;

import item.Item;

public class Ladder implements Item {

    private int startPos;
    private int endPos;

    public Ladder(int startPos, int endPos) {
        if(startPos > endPos){
            throw new IllegalArgumentException();
        }
        this.startPos = startPos;
        this.endPos = endPos;
    }

    @Override
    public String getName() {
        return "Ladder";
    }

    @Override
    public int getStartPos() {
        return this.startPos;
    }

    @Override
    public int getEndPos() {
        return this.endPos;
    }
}
