package model;

public class Item
{
    private int id;
    private String name;
    private double price;

    // constructors
    public Item()
    {
    }

    public Item(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    public Item(double price, String name, int id)
    {
        this.price = price;
        this.name = name;
        this.id = id;
    }

    // Getters setters

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
