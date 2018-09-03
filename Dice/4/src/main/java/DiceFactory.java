// this class handles the creation of dice
public class DiceFactory
{
  public static Rollable create(int i)
  {
    Rollable d = new Dice(i);
    return d;
  }
}