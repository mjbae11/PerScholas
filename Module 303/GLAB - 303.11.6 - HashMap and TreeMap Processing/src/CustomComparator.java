import java.util.Comparator;

public class CustomComparator implements Comparator<String>
{
    @Override
    public int compare(String o1, String o2)
    {
        // reverse order
        int value = o1.compareTo(o2);
        if (value > 0)
        {
            return -1;
        } else if (value < 0)
        {
            return 1;
        } else
        {
            return 0;
        }

    }
}
