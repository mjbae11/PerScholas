import java.util.Objects;

public class Employee
{
    //fields
    private String firstName;
    private String lastName;
    private String title;
    private double payRate;
    private double weeklySalary;

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
}