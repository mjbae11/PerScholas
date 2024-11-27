import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

//        task1PrintMultiplicationTable();
//        task2FindTheGCD();
//        task3PredictTuition();
    }

    private static void task3PredictTuition()
    {
        double tuition = 10_000;
        int year = 0;
        while (tuition <= 20000)
        {
            tuition = 1.07 * tuition;
            year++;
        }
        System.out.printf("Year: %d, and total tuition is %.2f\n", year, tuition);
    }

    private static void task2FindTheGCD()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gimme gimme 2 numbers: (a space inbetween please");
        String token1 = scanner.next();
        String token2 = scanner.next();
        int num1 = Integer.parseInt(token1);
        int num2 = Integer.parseInt(token2);
        // calculation
        int i = 2;
        int gcd = 1;
        while (i <= num1 && i <= num2)
        {
            int temp1 = num1 % i;
            int temp2 = num2 % i;
            if (temp1 == 0 && temp2 == 0)
            {
                gcd = i;
            }
            i++;
        }
        System.out.println("The greatest common denominator is " + gcd);
    }

    private static void task1PrintMultiplicationTable()
    {
        for (int i = 1; i <= 12; i++)
        {
            for (int j = 1; j <= 12; j++)
            {
                System.out.print("\t" + i * j + "\t");
            }
            System.out.println();
        }
    }


}