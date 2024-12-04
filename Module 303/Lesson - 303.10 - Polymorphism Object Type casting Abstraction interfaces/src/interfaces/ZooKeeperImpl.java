package interfaces;

public class ZooKeeperImpl implements ZooKeeper, ZooTest
{
    @Override
    public void feedAnimals()
    {
        System.out.println("I am feeding animals.");
    }

    @Override
    public void displayZooAnimals()
    {

    }

    @Override
    public void cleanEnclosure()
    {
        System.out.println("I am cleaning the enclosure.");
    }

    @Override
    public void recordAnimalHealth()
    {
        System.out.println("I am recording animal health data for all animals.");
    }
}
