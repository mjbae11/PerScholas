package generics;

import java.util.List;

public class LowerBound
{
    public void addNumbers(List<? super Integer> list)
    {
        list.add(42);
        list.add(100);
    }
}
