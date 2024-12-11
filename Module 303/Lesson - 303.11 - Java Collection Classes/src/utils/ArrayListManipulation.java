package utils;

import models.Employee;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListManipulation
{
    private ArrayList<Employee> employees = new ArrayList<>();
    public void addEmployee(Employee employee)

    {
        try
        {
            employees.add(employee);
            System.out.println("Added: " + employee);

        } catch (Exception e)
        {
            System.out.println("Failed to add employee: " + e.getMessage());
        }
    }

    public void addEmployeeList(ArrayList<Employee> employees)
    {
        for (Employee employee : employees)
        {
            try
            {
                this.employees.add(employee);
                System.out.println("Added: " + employee);

            } catch (Exception e)
            {
                System.out.println("Failed to add employee: " + e.getMessage());
            }
        }

    }

    public void displayEmployees()
    {
        System.out.println("\nEmployees List: ");
        try
        {
            Iterator<Employee> iterator = employees.iterator();
            while (iterator.hasNext())
            {
                System.out.println(iterator.next());
            }
        } catch (Exception e)
        {
            System.out.println("Failed to display employees: " + e.getMessage());
        }
    }

    public void checkEmployeeExists(Employee employee)
    {
        try
        {
            boolean exists = employees.contains(employee);
            System.out.println("Employee " + employee + " exists: " + exists);
        } catch (Exception e)
        {
            System.out.println("Failed to check employee: " + e.getMessage());
        }
    }

    public void removeEmployee(Employee employee)
    {
        boolean removed = employees.remove(employee);
        try
        {
            if (removed)
            {
                System.out.println("Employee " + employee + " removed");
            } else
            {
                System.out.println("Employee " + employee + " not removed, not found.");
            }

        } catch (Exception e)
        {
            System.out.println("Failed to remove employee: " + e.getMessage());
        }
    }

    public void checkEmployeeEligibility(int id, int age, double gpa) throws Exception
    {
        Employee employee = findEmployeeById(id);
        // Eligibility criteria
        if (age < 18 || gpa < 2.0)
        {
            throw new ArithmeticException("Employee " + employee.getName() + " not eligible for promotion.");
        } else
        {
            System.out.println("Employee " + employee.getName() + " IS eligible for promotion.");
        }
    }

    public Employee findEmployeeById(int id) throws Exception
    {
        for (Employee employee : employees)
        {
            if (employee.getId() == id)
            {
                return employee; // returning employee if found
            }
        }
        throw new Exception("Employee with id " + id + " not found.");
    }
}
