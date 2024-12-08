public class Triangle extends Shape
{
    // constructors
    public Triangle(String color)
    {
        super.color = color;
    }

    public void setBase(double base)
    {
        this.base = base;
    }

    @Override
    public double getArea()
    {
        return 0.5 * super.base * super.height;
    }

    @Override
    public void displayShapeName()
    {
        System.out.println("I am a triangle.");
    }

    @Override
    public String toString()
    {
        return "Triangle[ base = " + base + ", height = " + height + ", " + super.toString() + "]";
    }
}
