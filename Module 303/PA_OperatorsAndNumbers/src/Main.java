import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        question1LeftBitShift();
        question2RightBitShift();
        question3_and_4_andOrBitOperator();
        question5PostfixIncrement();
        question6ThreeIncrements();
        question7PreAndPostfixPractice();

        // practice stuff after this.

//        Integer integerObj = 10;
//        Character charObj = Character.valueOf('g');
//        System.out.println("Is digit? : " + Character.isDigit(charObj));
//        System.out.println(charObj.compareTo('4'));
//        System.out.println(charObj = Character.toUpperCase(charObj));
//        String stringPrim = "bruh: " + charObj + "type: " + charObj.getClass();
//        System.out.println(stringPrim);
//        System.out.println(String.valueOf(integerObj).getClass());
//        integerObj.doubleValue();
//        stringMethods();


        // Unboxing
//        int intValue = obj;
//        System.out.println(intValue);
//
//        // Parsing
//        int parseInt = Integer.parseInt(obj.toString());
//        System.out.println(parseInt);
//        double parseDouble = Double.parseDouble(doubleObj.toString());
//        System.out.println(parseDouble);


        // FOr Loop and while Loop
        useDoWhile();

    }
    public static void useDoWhile()
    {
        Scanner input = new Scanner(System.in);
        String correctPassword = "java123";
        String enteredPassword;

        do {
            System.out.println("enter your password: ");
            enteredPassword = input.nextLine();
        } while (!enteredPassword.equals(correctPassword));
        System.out.println("Access granted.");
    }

    private static void stringMethods()
    {
        String something = new String("bruh");
        String somethingElse = new String("bruh!!!");
        System.out.println(something == somethingElse);

        // methods
        System.out.println("Length: " + something.length() );
        System.out.println("to Uppercase: " + something.toUpperCase() );
        System.out.println("to Uppercase: " + something.isEmpty() );
        System.out.println("Equals: " + something.equals(somethingElse));
        System.out.println("Equals Ignore case: " + something.equalsIgnoreCase(somethingElse));

        System.out.println("Compare to: " + somethingElse.compareTo(something));
    }

    // practice with valueOf
    public void useValueOf()
    {
        Integer something = Integer.valueOf(100);
        Integer something2 = 200;
    }

    private static void question7PreAndPostfixPractice()
    {
        int x = 5, y = 8;
        int sum = x++ + y;
        System.out.println(sum);
        System.out.println(((Object)sum).getClass().getName());
    }

    private static void question6ThreeIncrements()
    {
        // 3 ways
        // for loop
        for (int i = 1; i <=3; i++)
        {
            System.out.println(i);
        }
        // while loop
        int i= 1;
        while (i <= 3)
        {
            System.out.println(i);
            i++;
        }
        // prefix operator basic
        int x = 1;
        System.out.println(x);
        System.out.println(++x);
        System.out.println(++x);
    }

    private static void question5PostfixIncrement()
    {
        int x = 10;
        System.out.println(x);
        x++;
        System.out.println(x);
    }

    private static void question3_and_4_andOrBitOperator()
    {
        int x = 7, y = 17, z;
        z = x & y;
        // prediction: 10
        System.out.println(z);
        z = x | y;
        // prediction: 23
        System.out.println(z);
    }

    private static void question2RightBitShift()
    {
        // for Question 2:
        int a = 150;
        System.out.println(Integer.toBinaryString(a));
        // result = 10010110
        a >>= 2;
        // shift 2 to the right = 37
        System.out.println(a);
        // result = 37


        // for Question 2, letter a:
        int x = 225;
        System.out.println(Integer.toBinaryString(x));
        // result = 11100001
        x >>= 2;
        // shift 2 to the right = 56
        System.out.println(x);
        // result = 56

        // for Question 2, letter b:
        int y = 1555;
        System.out.println(Integer.toBinaryString(y));
        // result = 11000010011
        y >>= 2;
        // shift 2 to the right = 388
        System.out.println(y);
        // result = 388

        // for Question 2, letter c:
        int z = 32456;
        System.out.println(Integer.toBinaryString(z));
        // result = 111111011001000
        z >>= 2;
        // shift 2 to the right = 8114
        System.out.println(z);
        // result = 8114
    }


    private static void question1LeftBitShift()
    {
        // for Question 1:
        int a = 2;
        System.out.println(Integer.toBinaryString(a));
        // result = 10
        a <<= 1;
        // shift 1 to the left = 01, wraps around?
        System.out.println(a);
        // result = 4


        // for Question 1, letter a:
        int x = 9;
        System.out.println(Integer.toBinaryString(x));
        // result = 1001
        x <<= 1;
        // shift 1 to the left = 10010
        System.out.println(x);
        // result = 18

        // for Question 1, letter b:
         int y = 17;
        System.out.println(Integer.toBinaryString(y));
        // result = 10001
        y <<= 1;
        // shift 1 to the left = 100010
        System.out.println(y);
        // result = 34

        // for Question 1, letter c:
         int z = 88;
        System.out.println(Integer.toBinaryString(z));
        // result = 1011000
        z <<= 1;
        // shift 1 to the left = 10110000
        System.out.println(z);
        // result = 176
    }
}