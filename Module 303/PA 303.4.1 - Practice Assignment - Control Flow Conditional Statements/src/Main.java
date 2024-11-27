import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
//        question1LessThan10();
//        question2GreaterThan10();
//        question3IfElseIf();
//        question4InRange();
//        question5Grades(scanner);
//        question6SwitchStatement(scanner);
//        question7TaxRateCalculator(scanner);
    }

    private static void question7TaxRateCalculator(Scanner scanner)
    {
        final double MARGINAL_TAX_RATE_10_PERCENT = 0.10;
        final double MARGINAL_TAX_RATE_15_PERCENT = 0.15;
        final double MARGINAL_TAX_RATE_25_PERCENT = 0.25;
        final double MARGINAL_TAX_RATE_28_PERCENT = 0.28;
        final double MARGINAL_TAX_RATE_33_PERCENT = 0.33;
        final double MARGINAL_TAX_RATE_35_PERCENT = 0.35;

        System.out.println("This program will estimate your tax payments based on filing status and income.");
        System.out.println("What is your filing status?");
        System.out.println("Please enter the corresponding number with your filing status: ");
        System.out.println("1) Single");
        System.out.println("2) Married Filing Jointly");
        System.out.println("3) Married Filing Separately");
        System.out.println("4) Head of Household");
        System.out.print("Please type the corresponding number with your filing status: ");
        int filingStatus = scanner.nextInt();
        System.out.print("Now please enter your income this year: ");
        int income = scanner.nextInt();
        System.out.println("_____________________________________");
        System.out.println("Thank you, here are your results: ");

        double totalTax = 0.00;
        switch (filingStatus)
        {
            // Single
            case (1):
            {
                if (income >= 0 && income <= 8350)
                    totalTax = MARGINAL_TAX_RATE_10_PERCENT * income;
                else if (income >= 8351 && income <= 33950)
                    totalTax = MARGINAL_TAX_RATE_15_PERCENT * income;
                else if (income >= 33951 && income <= 82250)
                    totalTax = MARGINAL_TAX_RATE_25_PERCENT * income;
                else if (income >= 82251 && income <= 171550)
                    totalTax = MARGINAL_TAX_RATE_28_PERCENT * income;
                else if (income >= 171551 && income <= 372950)
                    totalTax = MARGINAL_TAX_RATE_33_PERCENT * income;
                else if (income >= 372951)
                    totalTax = MARGINAL_TAX_RATE_35_PERCENT * income;
                else
                    System.out.println("Out of Range");
                break;
            }
            // Married, Filing Jointly
            case (2):
            {
                if (income >= 0 && income <= 16700)
                    totalTax = MARGINAL_TAX_RATE_10_PERCENT * income;
                else if (income >= 16701 && income <= 67900)
                    totalTax = MARGINAL_TAX_RATE_15_PERCENT * income;
                else if (income >= 67901 && income <= 137050)
                    totalTax = MARGINAL_TAX_RATE_25_PERCENT * income;
                else if (income >= 137051 && income <= 208850)
                    totalTax = MARGINAL_TAX_RATE_28_PERCENT * income;
                else if (income >= 208851 && income <= 372950)
                    totalTax = MARGINAL_TAX_RATE_33_PERCENT * income;
                else if (income >= 372951)
                    totalTax = MARGINAL_TAX_RATE_35_PERCENT * income;
                else
                    System.out.println("Out of Range");
                break;
            }
            // Married, Filing Separately
            case (3):
            {
                if (income >= 0 && income <= 8350)
                    totalTax = MARGINAL_TAX_RATE_10_PERCENT * income;
                else if (income >= 8351 && income <= 33950)
                    totalTax = MARGINAL_TAX_RATE_15_PERCENT * income;
                else if (income >= 33951 && income <= 68525)
                    totalTax = MARGINAL_TAX_RATE_25_PERCENT * income;
                else if (income >= 68526 && income <= 104425)
                    totalTax = MARGINAL_TAX_RATE_28_PERCENT * income;
                else if (income >= 104426 && income <= 186475)
                    totalTax = MARGINAL_TAX_RATE_33_PERCENT * income;
                else if (income >= 186476)
                    totalTax = MARGINAL_TAX_RATE_35_PERCENT * income;
                else
                    System.out.println("Out of Range");
                break;
            }
            // Head of Household
            case (4):
            {
                if (income >= 0 && income <= 11950)
                    totalTax = MARGINAL_TAX_RATE_10_PERCENT * income;
                else if (income >= 11951 && income <= 45500)
                    totalTax = MARGINAL_TAX_RATE_15_PERCENT * income;
                else if (income >= 45501 && income <= 117450)
                    totalTax = MARGINAL_TAX_RATE_25_PERCENT * income;
                else if (income >= 117451 && income <= 190200)
                    totalTax = MARGINAL_TAX_RATE_28_PERCENT * income;
                else if (income >= 190201 && income <= 372950)
                    totalTax = MARGINAL_TAX_RATE_33_PERCENT * income;
                else if (income >= 372951)
                    totalTax = MARGINAL_TAX_RATE_35_PERCENT * income;
                else
                    System.out.println("Out of Range");
                break;
            }
        }
        System.out.printf("You tax payment will be: $%.2f", totalTax);
    }

    private static void question6SwitchStatement(Scanner scanner)
    {
        System.out.println("Put a number between, inclusive, 1-7: ");
        switch(scanner.nextInt())
        {
            case (1):
                System.out.println("Monday");
                break;
            case (2):
                System.out.println("Tuesday");
                break;
            case (3):
                System.out.println("Wednesday");
                break;
            case (4):
                System.out.println("Thursday");
                break;
            case (5):
                System.out.println("Friday");
                break;
            case (6):
                System.out.println("Saturday");
                break;
            case (7):
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Out of range");

        }
    }

    private static void question5Grades(Scanner scanner)
    {
        System.out.println("What was your score: ");
        int grade = scanner.nextInt();
        if (grade <= 100 && grade >= 90)
        {
            System.out.println("A");
        } else if (grade <= 89 && grade >= 80)
        {
            System.out.println("B");
        } else if (grade <= 79 && grade >= 70)
        {
            System.out.println("C");
        } else if (grade <= 69 && grade >= 60)
        {
            System.out.println("D");
        } else if (grade < 60 && grade >= 0)
        {
            System.out.println("F");
        } else
        {
            System.out.println("Out of range");
        }
    }

    private static void question4InRange()
    {
        int x = 5;
        if (x >= 10 && x <= 20)
        {
            System.out.println("In range");
        } else
        {
            System.out.println("Not in range");
        }
    }

    private static void question3IfElseIf()
    {
        int x = 50;
        if (x < 10)
        {
            System.out.println("Less than 10");
        } else if (x > 10 && x < 20)
        {
            System.out.println("Between 10 and 20");
        } else
        {
            System.out.println("Greater than or equal to 20");
        }
    }

    private static void question2GreaterThan10()
    {
        question1LessThan10();
        int x = 15;
        if (x < 10)
        {
            System.out.println("Less than 10");
        } else
        {
            System.out.println("Greater than 10");
        }
    }


    private static void question1LessThan10()
    {
        int x = 15;
        if (x < 10)
        {
            System.out.println("Less than 10");
        }
    }
}