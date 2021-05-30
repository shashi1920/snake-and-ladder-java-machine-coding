package board;

public class Snake implements Item{

    private int startPos;
    private int endPos;

    public Snake(int startPos, int endPos) {
        if(startPos < endPos){
            throw new IllegalArgumentException();
        }
        this.startPos = startPos;
        this.endPos = endPos;
    }

    @Override
    public String getName() {
        return "Snake";
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
