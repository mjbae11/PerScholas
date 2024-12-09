package models;

public class Customer
{
    private int id;
    private String name;

    // Constructor builds objects
    public Customer(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
