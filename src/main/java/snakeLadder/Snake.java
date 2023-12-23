package snakeLadder;

public class Snake extends SpecialEntity{

    public Snake(int start, int end)
    {
        //calling constructor of parent class
        super(start, end);
    }
    @Override
    public String getId()
    {
        return "S_" + this.getEnd();
    }
}
