// this class handles the creation of dice
// it loads the die with a rolling strategy as
// part of the initialization of a die
public class DiceFactory
{
    public static Rollable create(int i)
    {
        Rollable d = new Dice(i);
        RollStrategy r = new RandomRoll(1, i);
        d.load(r);

        return d;
    }
}