public class CommEmp extends Employee
{
    private double totalSales;
    private double hoursWorked;
    private final double COMMISSION_RATE = 0.1;
    private final int MIN_SALES_FOR_COMMISSION = 1000;


    public CommEmp(String firstName, String lastName, String title, double payRate, double hoursWorked, double totalSales)
    {
        super(firstName, lastName, title, payRate);
        this.totalSales = totalSales;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary()
    {
        return totalSales >= MIN_SALES_FOR_COMMISSION ? (payRate * hoursWorked) + (totalSales * COMMISSION_RATE) : (payRate * hoursWorked);
    }

    public void display()
    {
        System.out.printf("Employee: %s %s, Title: %s\n", firstName, lastName, title);
        if (totalSales >= MIN_SALES_FOR_COMMISSION)
        {
            System.out.printf("Commissioned Salary: $%.2f\n", calculateSalary());
        } else
        {
            System.out.printf("Not enough sales, broke, fired Salary: $%.2f\n", calculateSalary());
        }
        // totalSales >= MIN_SALES_FOR_COMMISSION? System.out.printf("Commissioned Salary: $%.2f\n", calculateSalary()) : System.out.printf("Not enough sales, broke, fired Salary: $%.2f\n", calculateSalary())

    }


}
