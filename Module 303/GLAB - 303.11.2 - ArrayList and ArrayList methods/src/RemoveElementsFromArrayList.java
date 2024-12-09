import java.util.ArrayList;
import java.util.List;

public class RemoveElementsFromArrayList
{
    public static void main(String[] args)
    {
        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Ruby");

        System.out.println("Initial List: " + programmingLanguages);

        // Remove the element at index '5'
        programmingLanguages.remove(5);
        System.out.println("After remove(5): " + programmingLanguages);

        // Remove the first occurence of the given element form the ArrayList
        // (The remove() method returns false if the element does not exist in the Arraylist
        boolean isRemoved = programmingLanguages.remove("Kotlin");
        System.out.println("After removing \"Kotlin\": " + programmingLanguages);

        // Remove all the elements that exist in a given collection
        List<String> scriptingLanguages = new ArrayList<>();
        scriptingLanguages.add("Python");
        scriptingLanguages.add("Ruby");
        scriptingLanguages.add("Perl");

        programmingLanguages.removeAll(scriptingLanguages);
        System.out.println("After removeAll(scriptingLanguages): " + programmingLanguages);

        // Remove all the elements from the Arraylist
        programmingLanguages.clear();
        System.out.println("After clear: " + programmingLanguages);
    }
}
