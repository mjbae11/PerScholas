public class Circle extends Shape implements Movable
{
    protected double radius;
    private final double PI = Math.PI;
    private int x, y;

    // Constructors
    public Circle(int x, int y, double radius)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;

    }

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
        double area = PI * Math.pow(radius, 2);
        return area; // reference to parent class variable
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

    public String getCoordinate()
    {
        return "(" + this.x + ", " + this.y + ")";
    }

    @Override
    public void moveUp()
    {
        y++;
    }

    @Override
    public void moveDown()
    {
        y--;
    }

    @Override
    public void moveLeft()
    {
        x--;
    }

    @Override
    public void moveRight()
    {
        x++;
    }
}
