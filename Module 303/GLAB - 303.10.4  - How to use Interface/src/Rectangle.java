import org.w3c.dom.css.Rect;

public class Rectangle extends Shape implements Movable
{

    private int x, y;
    // Constructors
    public Rectangle(String color)
    {
        super.color = color;
    }

    public Rectangle()
    {
    }

    public Rectangle(int x, int y, String color)
    {
        this.x = x;
        this.y = y;
        super.color = color;
    }

    public Rectangle(int x, int y, String color, double width, double height)
    {
        this.x = x;
        this.y = y;
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

    // implement all the methods from the "movable interface"
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
