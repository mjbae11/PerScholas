package generics;

import models.Employee;

public class GenericClass <T extends Employee>
{
    // Fields
    private T value;

    // Constructor
    public GenericClass(T value)
    {
        this.value = value;
    }

    // Getters setters
    public T getEmployee()
    {
        return value;
    }

    public void setEmployees(T value)
    {
        this.value = value;
    }



    // display employee details
    public void displayEmployeeDetails()
    {
        System.out.println("Employee Details: " + value.toString());
    }
}
