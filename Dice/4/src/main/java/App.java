public class App
{
    public static int roll(Rollable d)
    {
        java.util.Random r = new java.util.Random();
        return (1 + r.nextInt(d.sides()));
    }

    public static void main(String [] args)
    {
        // creation of dice is done through the factory

        // create a 6 sided die
        Rollable d1 = DiceFactory.create(6);
        for (int i = 0; i < 10; i++)
        {
            System.out.println(roll(d1));
        }

        // create an 8 sided die
        Rollable d2 = DiceFactory.create(8);
        for (int i = 0; i < 10; i++)
        {
            System.out.println(roll(d2));
        }
    }
}