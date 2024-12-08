public abstract class Shape
{
    protected String color;
    protected double base;
    protected double width;
    protected double height;


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



    /*
    Area is unknown because we don't know what shape this is.
     */
    public abstract double getArea();

    @Override
    public String toString()
    {
        return "Shape[color = " + color + "]";
    }

    public void displayShapeName()
    {
        System.out.println("I am a shape.");
    }
}
