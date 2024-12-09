package generics;

import java.util.List;

public class GenericMethod
{
    public <T> void printList(List<T> list)
    {
        System.out.println("Printing list of employees:");
        for (T t : list)
        {
            System.out.println(t);
        }
    }
}
