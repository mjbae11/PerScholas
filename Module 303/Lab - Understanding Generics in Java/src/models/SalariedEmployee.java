package models;

public class SalariedEmployee extends Employee
{
    private double salary;

    // Constructor
    public SalariedEmployee(int id, String name, double salary)
    {
        super(id, name);
        this.salary = salary;
    }

    // Getters and Setters

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    @Override
    public String toString()
    {
        return "SalariedEmployee{id=" +
            super.getId() +
            ", name=\'" +
            super.getName() +
            "\', salary=" + salary +
            '}';
    }
}
