public class Rectangle extends Shape
{

    // Constructors
    public Rectangle(String color)
    {
        super.color = color;
    }

    public Rectangle()
    {
    }

    public Rectangle(String color, double width, double height)
    {
        super.color = color;
        super.width = width;
        super.height = height;
    }

    @Override
    public double getArea()
    {
        return super.width * super.height;
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
