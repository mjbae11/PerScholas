public class Rectangle extends Shape
{
    public Rectangle(String color)
    {
        super(color);
    }

    public Rectangle()
    {
    }

    public Rectangle(String color, double area, double base, double width, double height)
    {
        super(color, area, base, width, height);
    }

    @Override
    public void setBase(double base)
    {
        super.base = base;
    }

    @Override
    public void setWidth(double width)
    {
        super.width = width;
    }

    @Override
    public double getArea()
    {
        return width * height;
    }

    // calculation in GLAB is wrong, that one calculates for area instead
    public double perimeter()
    {
        return (2 * width) + (2 * height);
    }

    @Override
    public void displayShapeName()
    {
        System.out.println("I am a Rectangle.");
    }

    @Override
    public String toString()
    {
        return "Rectangle[height = " + height + ", width = " + width + ", " + super.toString() + "]";
    }




}
