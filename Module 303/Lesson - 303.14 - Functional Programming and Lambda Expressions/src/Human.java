@FunctionalInterface
public interface Human
{
    public void say();

    default void say(String something)
    {
        System.out.println(something);
    }

    default void something()
    {
        System.out.println("gert");
    }
}
