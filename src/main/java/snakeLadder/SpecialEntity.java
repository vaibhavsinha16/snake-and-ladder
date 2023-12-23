package snakeLadder;

import lombok.Getter;

public abstract class SpecialEntity {

    @Getter
    private int start;
    @Getter
    private int end;
    public SpecialEntity(int start, int end)
    {
        this.end = end;
        this.start = start;
    }

    //implement it in child class
    public abstract String getId();
    public int getActionPosition()
    {
        return this.start;
    }
    public int getEndPosition()
    {
        return this.end;
    }
}
