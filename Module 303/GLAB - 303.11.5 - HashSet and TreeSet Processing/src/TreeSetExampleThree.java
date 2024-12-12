import java.util.TreeSet;

public class TreeSetExampleThree
{
    public static void main(String[] args)
    {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        // using the first() method
        int first = numbers.first();
        System.out.println("first: " + first);

        // using the last() method
        int last = numbers.last();
        System.out.println("last: " + last);


    }
}
