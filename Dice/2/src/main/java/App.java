public class App
{
  public static int roll(Dice d)
  {
    java.util.Random r = new java.util.Random();
    return (1 + r.nextInt(d.sides()));
  }


  public static void main(String [] args)
  {
    // create a 6 sided die
    Dice d1 = new Dice(6);
    for (int i = 0; i < 10; i++)
    {
      System.out.println(roll(d1));
    }

    // create an 8 sided die
    Dice d2 = new Dice(8);
    for (int i = 0; i < 10; i++)
    {
      System.out.println(roll(d2));
    }
  }
}