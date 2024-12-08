public class WaterMonster extends Monster
{
    // Constructor
    public WaterMonster(String name)
    {
        super(name);
    }

    @Override
    String attack()
    {
        return "Attack with water!";
    }
}
