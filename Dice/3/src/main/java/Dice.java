// this represents the die; it now implements
// the Dice interface
public class Dice implements Rollable
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