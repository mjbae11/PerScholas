import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass
{
    HashSet<String> namesSet = new HashSet<>();

    public void useHashSet()
    {
        // add element to the hashset
        namesSet.add("A");
        namesSet.add("B");
        namesSet.add("C");
        namesSet.add("D");
        System.out.println("Original:" + namesSet);

        namesSet.add("A");
        namesSet.add("B");
        System.out.println("After adding duplicates: " + namesSet);


    }

    public void cloneHashSet()
    {
        HashSet<String> clonedHashSet = (HashSet<String>) namesSet.clone();
    }

    public void displayNames(String comment, HashSet<String> names)
    {
        System.out.println("-----------" + comment + "-----------");
        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext())
        {
            System.out.print(iterator.next());
            System.out.print(", ");
        }
        System.out.println();
        System.out.println("Size = " + names.size());
    }

    public void unionHashSets()
    {
        HashSet<String> animalsSet = new HashSet<>();
        animalsSet.add("W");
        animalsSet.add("X");
        animalsSet.add("Y");
        animalsSet.add("Z");
        animalsSet.add("A");
        animalsSet.add("B");

        // Union
        HashSet<String> unionSet = new HashSet<>(animalsSet);
        unionSet.addAll(namesSet);
        displayNames("union set", unionSet);
    }

    public void retainHashSet()
    {
        namesSet.retainAll(namesSet);
    }
}
