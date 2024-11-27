import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Task 1:");
        task1ArrayPrint();
//        task2MiddleIndex();
//        task3CloneMethod();
//        task4exceptions();
//        task5assignInArray();
        System.out.println("Task 6:");
        task6MultiplyBy2();
//        task7AvoidMiddleIndex();
//        task8Swap();
//        task9SortArray();
//        task10ObjectArray();
//        task11FavoriteThings();
    }

    private static void task11FavoriteThings()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many favorite things do you have?");
        int num = scanner.nextInt();
        scanner.nextLine();
        String[] objects = new String[num];
        for (int i = 0; i < num; i++ )
        {
            System.out.println("Enter your thing");
            objects[i] = scanner.nextLine();
        }
        System.out.println(Arrays.toString(objects));
    }

    private static void task10ObjectArray()
    {
        Object[] array = {5, "adam", "james", "ronald", 14.5};
        System.out.println(Arrays.toString(array));
    }

    private static void task9SortArray()
    {
        int[] array = {4, 2, 9, 13, 1, 0};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Smallest number is: " + array[0]);
        System.out.println("Largest number is: " + array[array.length - 1]);
    }

    private static void task8Swap()
    {
        String[] array = {"adam", "bob", "charlie", "daryl", "eric"};
        String temp = array[2];
        array[2] = array[0];
        array[0] = temp;
        System.out.println(Arrays.toString(array));
    }

    private static void task7AvoidMiddleIndex()
    {
        int[] array = {1,2,3,4,5};
        for (int i = 0; i < array.length; i++)
        {
            if (i == array.length/2)
            {
                // dont print anything
            } else
            {
                System.out.println(array[i]);
            }
        }
    }

    private static void task6MultiplyBy2()
    {
        int[] array = {1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++)
        {
            array[i] *= 2;
        }
        System.out.println(Arrays.toString(array));
    }

    private static void task5assignInArray()
    {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));
    }

    private static void task4exceptions()
    {
        int[] numbers = {1,2,3,4,5};
        // first index
        System.out.println(numbers[0]);
        System.out.println(numbers[numbers.length - 1]);
//        System.out.println(numbers[numbers.length]);   wont work
//        numbers[5] = 6; will product exception
    }

    private static void task3CloneMethod()
    {
        String[] strings = {"red, green, blue, yellow"};
        System.out.println(strings.length);
        String[] newString = strings.clone();
        System.out.println(Arrays.toString(newString));
    }

    private static void task2MiddleIndex()
    {
        int[] array = {13, 5, 7, 68, 2};
        int middleIndex = array.length / 2;
        System.out.println("Middle Index: " + array[middleIndex]);
    }

    private static void task1ArrayPrint()
    {
        int[] array = {1, 2, 3};
        for (int num : array)
        {
            System.out.println(num);
        }
    }
}