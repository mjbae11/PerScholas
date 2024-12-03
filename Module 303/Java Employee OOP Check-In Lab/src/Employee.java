import java.util.Objects;
import java.util.Scanner;

public class Employee
{
    //fields
    protected String firstName;
    protected String lastName;
    protected String title;
    protected double payRate;
    protected double weeklySalary;

    // constructors
    public Employee()
    {

    }

    public Employee(String firstName, String lastName, String title, double payRate)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.payRate = payRate;
    }

    // getters and setters
    public String getFirstName()
    {
        return this.firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return this.firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;

    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public double getPayRate()
    {
        return payRate;
    }

    public void setPayRate(double payRate)
    {
        this.payRate = payRate;
    }

    public double getWeeklySalary()
    {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary)
    {
        this.weeklySalary = weeklySalary;
    }

// methods! :)

    public double calculateSalary()
    {
        return 0.0;
    }
    // // [firstName=John, lastName=Doe, title=Software Engineer, payRate=50.0]
    @Override
    public String toString()
    {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", title='" + title + '\'' +
                ", payRate=" + payRate +
                ", weeklySalary=" + weeklySalary +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(title, employee.title);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(firstName, lastName, title);
    }

    public double calculateWeeklySalary()
    {
        weeklySalary = payRate * 40;
        return weeklySalary;
    }

    public void inputEmployee()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee type (salaried/hourly/commissioned): ");
        String employeeType = scanner.nextLine();
        System.out.print("Enter the first name: ");
        firstName = scanner.nextLine();
        System.out.print("Enter the last name: ");
        lastName = scanner.nextLine();
        System.out.print("Enter the title: ");
        title = scanner.nextLine();
        switch (employeeType)
        {
            case "salaried":
            {
                System.out.print("Enter annual salary: ");
                payRate = scanner.nextDouble();
                SalaryEmp employee = new SalaryEmp(firstName, lastName, title, payRate);
                System.out.println();
                employee.display();
                break;
            }
            case "hourly":
            {
                System.out.print("Enter hourly salary: ");
                payRate = scanner.nextDouble();
                System.out.print("Enter hours worked: ");
                int hours = scanner.nextInt();
                HourlyEmp employee = new HourlyEmp(firstName, lastName, title, payRate, hours);
                System.out.println();
                employee.display();
                break;
            }
            case "commissioned":
            {
                System.out.print("Enter hourly salary: ");
                payRate = scanner.nextDouble();
                System.out.println("Enter amount of hours: ");
                int hours = scanner.nextInt();
                System.out.print("Enter amount of sales: ");
                int totalSales = scanner.nextInt();
                CommEmp employee = new CommEmp(firstName, lastName, title, payRate, hours, totalSales);
                System.out.println();
                // if

                employee.display();
                // employee.display(totalSales)
                break;
            }
        }
        scanner.close();
    }
}