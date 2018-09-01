public class App
{
  public static int roll()
  {
    java.util.Random r = new java.util.Random();
    return (1 + r.nextInt(6));
  }


  public static void main(String [] args)
  {
    // roll multiple times
    for (int i = 0; i < 10; i++)
    {
      System.out.println(roll());
    }
  }
}