public class App
{
    public static int roll(Rollable d)
    {
        int i = d.roll();
        return i;
    }

    public static void main(String [] args)
    {
        // create a die; by deafult it is loaded with
        // the random rolling strategy
        Rollable d = DiceFactory.create(6);
        for (int i = 0; i < 10; i++)
        {
            System.out.println(roll(d));
        }

        // explicitly load it with a different
        // rolling strategy at 'run time'
        RollStrategy r = new CyclicRoll(1, d.sides());
        d.load(r);

        for (int i = 0; i < 10; i++)
        {
            System.out.println(roll(d));
        }
    }
}