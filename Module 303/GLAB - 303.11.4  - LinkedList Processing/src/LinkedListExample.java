import java.util.LinkedList;

public class LinkedListExample
{
    public static void main(String[] args)
    {

        /* Linked List Declaration */
        LinkedList<String> linkedlist = new LinkedList<String>();

        /*add(String Element) is used for adding
         * the elements to the linked list*/
        linkedlist.add("Item1");
        linkedlist.add("Item5");
        linkedlist.add("Item3");
        linkedlist.add("Item6");
        linkedlist.add("Item2");

        /*Display Linked List Content*/
        System.out.println("--------- display after adding elements ---------");
        System.out.println("Linked List Content: " +linkedlist);

        /* Add First and last element */
        System.out.println("-------- add first and last element --------");
        linkedlist.addFirst("First Item");
        linkedlist.addLast("Last Item");
        System.out.println("Linked list content after addition: " + linkedlist);

        /* How to get and set values */
        System.out.println("------- Get and set values -------");
        Object firstVar = linkedlist.get(0);
        System.out.println("First element: " + firstVar);
        linkedlist.set(0, "Changed first item");
        Object firstvar2 = linkedlist.get(0);
        System.out.println("First element after setting: " + firstvar2);

        /* Remove first and last element */
        linkedlist.removeFirst();
        linkedlist.removeLast();
        System.out.println("Linked list content after removal : " + linkedlist);
        
        /* Add to a position and remove from a position */
        linkedlist.add(0, "Newly added item");
        linkedlist.remove(2);
        System.out.println("Final content after adding and removing: " + linkedlist);

    }
}
