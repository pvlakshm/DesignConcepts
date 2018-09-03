// this represents a die
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


  private int numSides;
}