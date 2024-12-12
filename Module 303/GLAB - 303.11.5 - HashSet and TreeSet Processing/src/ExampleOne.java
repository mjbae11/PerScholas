import java.util.HashSet;

public class ExampleOne
{
    public static void main(String[] args)
    {
        HashSet<Integer> evenNumber = new HashSet<>();

        // using add method
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        System.out.println("Default evennumber hashset: " + evenNumber);

        // Create new HashSet
        HashSet<Integer> numbers = new HashSet<>();
        // Using addAll() method
        numbers.addAll(evenNumber);
        numbers.add(5);
        System.out.println("New \"numbers\" hashset: " + numbers);

    }

}
