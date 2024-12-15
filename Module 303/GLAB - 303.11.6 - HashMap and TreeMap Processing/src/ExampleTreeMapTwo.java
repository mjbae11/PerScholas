import java.util.TreeMap;

public class ExampleTreeMapTwo
{
    public static void main(String[] args)
    {
        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("First", 1);
        numbers.put("Second", 2);
        numbers.put("Third", 3);
        System.out.println("TreeMap: " + numbers);

        // Using the firstKey Method
        System.out.println("First key: " + numbers.firstKey());

        // Using the lastKey Method
        System.out.println("Last Key: " + numbers.lastKey());

        // Using the firstEntryMethod()
        System.out.println("First Entry: " + numbers.firstEntry());

        // Useing the lastEntryMethod();
        System.out.println("Last Entry: " + numbers.lastEntry());
    }
}
