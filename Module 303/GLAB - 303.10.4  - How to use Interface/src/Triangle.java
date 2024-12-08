public class Triangle extends Shape implements Movable
{
    // fields
    private int x, y;

    // constructors
    public Triangle(int x, int y, String color)
    {
        this.x = x;
        this.y = y;
        super.color = color;
    }

    public Triangle(int x, int y, String color, int base)
    {
        this.x = x;
        this.y = y;
        super.color = color;
        super.base = base;
    }
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

    // implement interface "Movable" methods

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

    @Override
    public String getCoordinate()
    {
        return "(" + this.x + ", " + this.y + ")";
    }
}
