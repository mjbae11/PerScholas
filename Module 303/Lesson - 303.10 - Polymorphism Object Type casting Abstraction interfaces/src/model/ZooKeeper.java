package model;

public class ZooKeeper
{
    private String name;

    public ZooKeeper(String name)
    {
        this.name = name;
    }

    public class Schedule
    {
        public void showSchedule()
        {
            System.out.println(name + "'s schedule includes feeding and cleaning.");
        }
    }
}
