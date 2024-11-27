import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
//        readStringMethod();
//        charAtScanner();
//        String test = "Programming";
//        String sub1 = test.substring(0, 3);
//        String sub2 = test.substring(8, test.length());
//        boolean isPro = sub1.contains("Pro");
//        boolean isIng = sub2.contains("Ing");
//        System.out.println(test.startsWith("Pro"));
//        System.out.println(test.endsWith("ing"));
//
//        String str = "Character";
//        // task A
//        int index = str.indexOf('a');
//        // Task b
//        int lastIndex = str.lastIndexOf('a');
//        // Task C
//        "Learning Java".contains("Java");
//        System.out.println(index);
        StringBuffer sb1 = new StringBuffer("Hello World");
        System.out.println(sb1.capacity());
        System.out.println(sb1.append("bruh"));
        System.out.println(sb1.insert(4, "run"));
        System.out.println(sb1.replace(0, 5, "kys"));
        System.out.println(sb1.reverse());
        System.out.println(sb1.capacity());
        System.out.println(sb1.length());
        sb1.ensureCapacity(50);
        System.out.println(sb1.capacity());

    }


    private static void readStringMethod()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three words seperated by spaces: ");
        String s1 = input.next();
        String s2 = input.next();
        String s3 = input.next();
        System.out.println("First word: " + s1);
        System.out.println("Second word: " + s2);
        System.out.println("Third word: " + s3);
    }

    private static void charAtScanner()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Character: ");
        String s = input.nextLine();
        char ch = s.charAt(0);
        System.out.println("The character is " + ch);
    }
}