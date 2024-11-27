import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
//        example1DisplayText();
//        example2SumOfN();
//        example3IsPalindrome(scanner);
//        example4Pyramid();

    }

    private static void example4Pyramid()
    {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();//new line
        }
    }

    private static void example3IsPalindrome(Scanner scanner)
    {
        // Determines if a string or a number is a palindrome
        // string reverse, string original
        // get input
        // for loop, starts at end
            // reverse = reverse + charAt(i)
        // if reverse .equals original
            // is a palindrome
        // else
            // nah
        String reverse = "", original;
        original = scanner.nextLine();
        for (int i = original.length() - 1; i >= 0; i--)
        {
            reverse = reverse + original.charAt(i);
        }
        if (reverse.equals(original))
        {
            System.out.println("Is Palindrome");
        } else
        {
            System.out.println("Not Palindrome");
        }
    }

    // sum natural numbers, 1 - 1000
    private static void example2SumOfN()
    {
        int sum = 0;
        // for loop
        for (int i = 1; i <= 1000; ++i) {
            // body inside for loop
            sum += i;     // sum = sum + i
        }
        System.out.println("Sum = " + sum);
    }

    // Program to print a text 5 times
    private static void example1DisplayText()
    {

        int n = 5;
        // for loop
        for (int i = 1; i <= n; ++i) {
            System.out.println("Java is fun");
        }
    }
}