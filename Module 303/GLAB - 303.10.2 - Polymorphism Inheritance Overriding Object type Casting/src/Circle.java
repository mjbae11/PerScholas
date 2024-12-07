public class Circle extends Shape
{
    protected double radius;
    private final double PI = Math.PI;

    // Constructors
    public Circle(double radius)
    {
        this.radius = radius;
    }

    public Circle(double radius, double height)
    {
        this.radius = radius;
        super.height = height;
    }

    public double getArea()
    {
        super.area = PI * Math.pow(this.radius, 2);
        return super.area; // reference to parent class variable
    }

    @Override
    public void displayShapeName()
    {
        System.out.println("Drawing circle of radius: " + this.radius);
    }

    @Override
    public String toString()
    {
        return "Circle[radius = " + this.radius + ", " + super.toString() + "]";
    }


}
