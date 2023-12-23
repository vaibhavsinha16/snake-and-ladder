package snakeLadder;

import lombok.Getter;
import lombok.Setter;

public class Dice {

    @Getter
    @Setter
    private int maxValue;

    public Dice(int maxVal)
    {
        this.maxValue = maxVal;
    }
    public int roll(int maxValue){

        return (int) Math.floor(Math.random()*maxValue + 1);
    }

}
