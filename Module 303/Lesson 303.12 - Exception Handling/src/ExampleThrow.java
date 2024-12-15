import java.io.IOException;

public class ExampleThrow {
    //declare exception using throws in the method signature
    public void testMethod(int num) throws IOException, ArithmeticException{
        if(num==1)
            System.out.println();
        else
            throw new ArithmeticException("ArithmeticException");
    }
}

