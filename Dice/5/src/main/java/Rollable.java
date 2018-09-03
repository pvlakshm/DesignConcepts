// the interface representing a die
interface Rollable
{
    public int sides();
    public void load(RollStrategy r);
    public int roll();
}