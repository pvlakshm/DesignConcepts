// this represents a die
public class Dice
{
    public Dice(int i)
    {
        numSides = i;
    }


    public int sides()
    {
        return numSides;
    }

    // number of sides on the die
    private int numSides;
}