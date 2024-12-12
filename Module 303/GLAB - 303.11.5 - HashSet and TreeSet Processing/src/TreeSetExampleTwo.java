import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExampleTwo
{
    public static void main(String[] args)
    {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        // Using the remove method
        boolean value1 = numbers.remove(5);
        System.out.println("is 5 removed? : " + value1);
        System.out.println(numbers);


        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext())
        {
            System.out.print(iterator.next() + ", ");
        }
        System.out.println();
        // using the removeAll() method
        boolean value2 = numbers.removeAll(numbers);
        System.out.println("Are all the elements removed? : " + value2);
        while (iterator.hasNext())
        {
            System.out.print(iterator.next() + ", ");
        }
        System.out.println();

    }
}
