// this represents on strategy of loading a die
public class RandomRoll implements RollStrategy
{
    public RandomRoll(int i, int j)
    {
        from = i;
        through = j;
    }

    public int roll()
    {
        java.util.Random r = new java.util.Random();
        int ceiling = through + 1;
        int i = from + r.nextInt(ceiling);

        return i;
    }

    private int from;
    private int through;
}