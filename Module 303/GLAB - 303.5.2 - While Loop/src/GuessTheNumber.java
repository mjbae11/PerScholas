import java.util.Scanner;

public class GuessTheNumber
{
    public static void main(String[] args)
    {

//        example1GuessTheNumber();

    }

    private static void example1GuessTheNumber()
    {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.print("Guess a number between 1 and 100: ");
            int guess = 0;
            boolean exit;
            int botRandom = (int) (Math.random() * 100) + 1;
            do
            {
                guess = scanner.nextInt();
                if (guess == botRandom)
                {
                    System.out.println("You guessed the number between 1 and 100!");
                    System.out.println("The number was: " + botRandom);
                    break;
                } else if (guess > botRandom && guess <= 100)
                {
                    System.out.println("the number is lower than your guess.");
                    System.out.print("Try again: ");
                } else if (guess < botRandom && guess >= 1)
                {
                    System.out.println("the number is higher than your guess");
                    System.out.print("Try again: ");
                } else
                {
                    System.out.println("Out of bounds");
                    System.out.println("Try again: ");
                }
            } while (true);
            System.out.println("--------------------------------");
            System.out.println("Would you like to play again? Y/N");
            if (scanner.next().equalsIgnoreCase("N"))
            {
                break;
            }
        }
        scanner.close();
    }
}