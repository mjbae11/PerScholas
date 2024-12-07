public class Shape
{
    private String color;
    protected double area = 1.0;
    protected double base = 1.0;
    protected double width = 1.0;
    protected double height = 1.0;

    // constructors
    /*
    Constructs a shape with just a given color
     */
    public Shape()
    {

    }

    public Shape(String color)
    {
        this.color = color;
    }

    public Shape(String color, double area, double base, double width, double height)
    {
        this.color = color;
        this.area = area;
        this.base = base;
        this.width = width;
        this.height = height;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public void setArea(double area)
    {
        this.area = area;
    }

    public void setBase(double base)
    {
        this.base = base;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    @Override
    public String toString()
    {
        return "Shape[color = " + color + "]";
    }

    /*
    Area is unknown because we don't know what shape this is.
     */
    public double getArea()
    {
        System.out.println("Error! Shape unknown, cannot compute area.");
        return 0;
    }

    public void displayShapeName()
    {
        System.out.println("I am a shape.");
    }
}
