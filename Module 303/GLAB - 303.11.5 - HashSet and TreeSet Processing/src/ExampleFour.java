import java.util.HashSet;

public class ExampleFour
{
    public static void main(String[] args)
    {
        // HashSet declaration
        HashSet<String> hset = new HashSet<String>();

        // Adding elements to the HashSet
        hset.add("Apple");
        hset.add("Mango");
        hset.add("Grapes");
        hset.add("Orange");
        hset.add("Fig");
        //Addition of duplicate elements
        hset.add("Apple");
        hset.add("Mango");
        //Addition of null values
        hset.add(null);
        hset.add(null);

        // Using enhanced for loop
        for (String s : hset)
        {
            System.out.print(s + ", ");
            System.out.println();
        }
    }
}
