public class SalaryEmp extends Employee
{
    private final int AMOUNT_OF_BI_MONTHLY_PAYMENTS_ANNUALLY = 24;

    public SalaryEmp(String firstName, String lastName, String title, double payRate)
    {
        super(firstName, lastName, title, payRate);
    }

    @Override
    public double calculateSalary()
    {
        return payRate / AMOUNT_OF_BI_MONTHLY_PAYMENTS_ANNUALLY;
    }

    public void display()
    {
        System.out.printf("Employee: %s %s, Title: %s\n", firstName, lastName, title);
        System.out.printf("Bi-Monthly Salary: $%.2f\n", calculateSalary());
    }
}
