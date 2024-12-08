
public class MyRunner
{
    public static void main(String[] args)
    {
        // object creation of the Circle class
        Circle c = new Circle(100);
        System.out.println("Area of Circle " + c.getArea());

        // Shape sObj = new Shape(); // This will give Error, we can not instantiate Abstract class

        // object creation of the Circle class
        System.out.println("+++++++++++++++++");
        // it’s fine because a Circle is a Shape by inheritance
        Shape shapeCircleObj = new Circle(100);  // UpCasting
        shapeCircleObj.displayShapeName();
        System.out.println("Area of Circle " + shapeCircleObj.getArea());
        System.out.println(shapeCircleObj);  // Run circle's toString()
        // Use instanceof operator for Validation
        System.out.println(shapeCircleObj instanceof Circle); // true

        System.out.println("+++++++++++++++++");
        Shape shapeRectangleObj = new Rectangle("Red"); //UpCasting
        shapeRectangleObj.displayShapeName();
        shapeRectangleObj.setHeight(2);
        shapeRectangleObj.setWidth(4);
        System.out.println("Area of Rectangle is " + shapeRectangleObj.getArea());
        System.out.println(shapeRectangleObj);  // Run Rectangle's toString()
        // Use instanceof operator for Validation
        System.out.println(shapeRectangleObj instanceof Rectangle); // true

        System.out.println("--------------------");
        Shape shapeTriangleObj = new Triangle("Blue"); //UpCasting
        shapeTriangleObj.displayShapeName();
        shapeTriangleObj.setHeight(10);
        shapeTriangleObj.setBase(15);
        System.out.println("Area of Triangle is " + shapeTriangleObj.getArea());
        System.out.println(shapeTriangleObj);  // Run Triangle's toString()
    }
}