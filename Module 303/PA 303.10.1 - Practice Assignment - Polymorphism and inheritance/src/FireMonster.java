public class FireMonster extends Monster
{
    // Constructor
    public FireMonster(String name)
    {
        super(name);
    }

    @Override
    String attack()
    {
        return "Attack with Fire!";
    }
}
