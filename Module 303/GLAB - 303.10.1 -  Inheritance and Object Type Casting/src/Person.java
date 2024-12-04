public class Person
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
    }

    String name;
    static int lifeSpan = 60;
    static double ageFactor = 1.0;

    public Person()
    {
        name = "";
    }

    public Person(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return ("Hello, my name is " + name);
    }

    public String talk()
    {
        return ("I have nothing to say.");
    }

    public String walk()
    {
        return ("I have nowhere to go.");
    }

    public static double lifeSpan()
    {
        return(lifeSpan * ageFactor);
    }

}