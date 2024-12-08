public abstract class Shape
{
    protected String color;
    protected double base = 1.0;
    protected double width = 1.0;
    protected double height = 1.0;


    public void setColor(String color)
    {
        this.color = color;
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
    public abstract double getArea();

    public void displayShapeName()
    {
        System.out.println("I am a shape.");
    }
}
