// this represents one strategy of loading a die
public class CyclicRoll implements RollStrategy
{
  public CyclicRoll(int i, int j)
  {
    from    = i;
    through = j;
    curVal  = from;
  }


  public int roll()
  {
    if (curVal > through)
    {
      curVal = from;
    }

    return curVal++;
  }


  private int curVal;
  private int from;
  private int through;
}