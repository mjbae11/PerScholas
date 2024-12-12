import java.util.Collections;
import java.util.LinkedList;

public class LinkedListSortExample
{
    public static void main(String[] args)
    {
        // Create linked list
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("D");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("A");

        // Unsorted
        System.out.println("Unsorted: " + linkedList);

        // 1. Sort the list
        Collections.sort(linkedList);
        // Sorted
        System.out.println("Sorted: " + linkedList);

        // 2. Custom Sorting
        Collections.sort(linkedList, Collections.reverseOrder());
        // Customer sorted (Reversed)
        System.out.println("Reversed: " + linkedList);
    }
}
