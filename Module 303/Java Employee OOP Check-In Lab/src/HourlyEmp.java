public class HourlyEmp extends Employee
{
    private double hoursWorked;

    public HourlyEmp(String firstName, String lastName, String title, double payRate, double hoursWorked)
    {
        super(firstName, lastName, title, payRate);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary()
    {
        return payRate * hoursWorked;
    }

    public void display()
    {
        System.out.printf("Employee: %s %s, Title: %s\n", firstName, lastName, title);
        System.out.printf("Hours Worked: %.1f\n", hoursWorked);
        System.out.printf("Weekly Pay: $%.2f\n", calculateSalary());
    }
}
