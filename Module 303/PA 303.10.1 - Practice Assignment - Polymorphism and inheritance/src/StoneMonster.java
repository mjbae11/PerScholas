public class StoneMonster extends Monster
{
    // Constructor
    public StoneMonster(String name)
    {
        super(name);
    }

    @Override
    String attack()
    {
        return "Attack with stone!";
    }
}
