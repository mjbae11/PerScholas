import java.util.HashSet;

public class ExampleThree
{
    public static void main(String[] args)
    {
        HashSet<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        System.out.println("HashSet1: " + primeNumbers);

        // Odd numbers hashset
        HashSet<Integer> oddNumbers = new HashSet<>();
        oddNumbers.add(1);
        oddNumbers.add(3);
        oddNumbers.add(5);
        System.out.println("HashSet2: " + oddNumbers);

        // Difference between Hashset 1 and Hashset 2
        primeNumbers.removeAll(oddNumbers);
        System.out.println("Primenumbers after the difference: " + primeNumbers);
    }
}
