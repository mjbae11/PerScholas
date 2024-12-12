import java.util.TreeSet;

public class TreeSetClass
{
    TreeSet<Integer> evenNumbers = new TreeSet<Integer>();

    public void useTreeSet()
    {
        // use add method to add elements
        evenNumbers.add(1);
        evenNumbers.add(2);
        evenNumbers.add(3);
        evenNumbers.add(4);
        System.out.println("Treeset: " + evenNumbers);



        // duplicates
        evenNumbers.add(2);
        evenNumbers.add(4);
        System.out.println("TreeSet after adding duplicates: " + evenNumbers);

        // Null
        try
        {
            evenNumbers.add(null);
            System.out.println("TreeSet after adding null: " + evenNumbers);
        } catch (NullPointerException e)
        {
            System.out.println("THROWN ERROR Unable to add null elements to Treeset: " + e.getMessage());
        }

        // using addall
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(6);
        numbers.addAll(evenNumbers);
        evenNumbers = numbers;
        System.out.println("TreeSet after adding even numbers to numbers: " + numbers);

        /* navigate through elements */
        // first
        System.out.println("First element: " + evenNumbers.first());

        // last element
        System.out.println("Last element: " + evenNumbers.last());

        // subset of elements
        System.out.println("Current treeset: " + evenNumbers);
        System.out.println("Current treeset less than 4: " + evenNumbers.headSet(4));

        // elements greater or equal to 2
        System.out.println("Treeset.tailset, greater or equal to 3: " + evenNumbers.tailSet(3));

    }
}
