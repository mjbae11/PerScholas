import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int [] numbers = {5, 10, 15, 20, 25};
//        useToString(numbers);
//        useSort(numbers);
//        useForLoop(numbers);
//        useClone(numbers);
//        useArrayCopy(numbers);
//        useSumArrayElements(numbers);
    // Search Algorithims
//        linearSearch(numbers);
        int target = 20;
        int left = 0;
        int right = numbers.length - 1;
        while (left <= right)
        {
            int mid = left + (right - left) / 2;
            if (numbers[mid] == target)
            {
                System.out.println(mid);
            } else if (numbers[mid] < target)
            {
                left = mid + 1; // shift left pointer to right 1
            } else
            {
                right = mid - 1; // shift right pointer to left 1
            }
        }
        System.out.println("return -1 cause should be not found");
    }

    private static void linearSearch(int[] numbers)
    {
        // Linear Search
        int target = 15;
        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] == target)
            {
                System.out.println("Number found: " + numbers[i]);
            } else
            {
                System.out.println("Number not found");
            }
        }
    }


    public static void useSumArrayElements(int [] numbers)
    {

        int sum = 0;
        for(int num: numbers)
        {
            sum += num;
        }
        System.out.println("Sum: " + sum);
    }

    public static void useArrayCopy(int[] numbers)
    {
        int[] destination = new int[numbers.length];
        System.arraycopy(numbers, 1, destination, 0, 3);
        System.out.println(Arrays.toString(destination));
    }

    public static void useClone(int[] numbers)
    {
        int[] destination = numbers.clone();
        System.out.println(Arrays.toString(destination));
        System.out.println(destination);
        System.out.println(numbers);
    }

    // quickly display whats within an array
    public static void useToString(int[] numbers)
    {
        System.out.println(Arrays.toString(numbers));
    }

    public static void useSort(int[] numbers)
    {
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void useForLoop(int[] numbers)
    {
        int[] destination = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++)
        {
            destination[i] = numbers[i];
        }
        System.out.println(Arrays.toString(destination));
    }
}