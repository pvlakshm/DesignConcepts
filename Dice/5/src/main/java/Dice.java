// this represents a die.
// Note that it can be 'loaded' with a rolling strategy
public class Dice implements Rollable
{
    public int sides()
    {
        return numSides;
    }

    public Dice(int i)
    {
        numSides = i;
        load = null;
    }

    public void load(RollStrategy r)
    {
        load = r;
    }

    public int roll()
    {
        int i = -1;

        if (load != null)
        {
            i = load.roll();
        }

        return i;
    }

    private int numSides;
    private RollStrategy load;
}