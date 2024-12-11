import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        // Initialize array and add 5 names
        List<String> students = new ArrayList<>();
        students.add("mike");
        students.add("bob");
        students.add("joe");
        students.add("emma");
        students.add("jazz");

        // Print list of names
        System.out.println(students);

        // Remove a name and print updated list
        students.remove(2);
        System.out.println(students);

        // Sort the list alphabetically and print
        Collections.sort(students);
        System.out.println(students);
    }
}