import java.util.Scanner;

public class Customer
{
    String[] customers = new String[5];

    public static void main(String[] args)
    {
        Customer customer = new Customer();
        customer.inputCustomerData();
        customer.displayCustomerData();

    }

    // input customer data method
    public void inputCustomerData()
    {
        Scanner scanner = new Scanner(System.in);

        String firstName, lastName;
        for (int i = 1; i <= customers.length; i++)
        {
            while (true)
            {
                System.out.print("Enter your first name " + (i) + " : ");
                firstName = scanner.nextLine();
                if (!firstName.isEmpty())
                {
                    break;
                }
                System.out.println("Cannot be empty. Try again");
            }
            while (true)
            {
                System.out.println("Enter your last name " + (i) + " : ");
                lastName = scanner.nextLine();
                if (!lastName.isEmpty())
                {
                    break;
                }
                System.out.println("Cannot be empty. Try again");
            }
            customers[i-1] = firstName + " " + lastName;
        }
    }

    public void displayCustomerData()
    {
        System.out.println("Customer List:");
        for (String customer : customers)
        {
            System.out.println(customer);
        }
    }
}