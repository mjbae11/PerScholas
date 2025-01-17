import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambdas
{
    public void useNoParam()
    {
        Human HMsg = () ->
        {
            System.out.println("No params with curly methods");
        };
        HMsg.say();
    }

    /**
     * () -> statement/expression //No parameters, without paraentheses, expression body, void result
     */
    public void useNoParamNoParenthesis()
    {
        Human HMsg = () -> System.out.println("No params with curly methods");
        HMsg.say();
    }

    /**
     * using
     */
    public void useOneParamNoBracketAndParenthesis()
    {

    }

    // BI Consumer used for lambdas that take two inputs but do not return anything
    // Example: printing sthe sum of two numbers
    // Multiple parameters, no return statement, single line
    public void useBiConsumer()
    {
        BiConsumer<Integer, Integer> printSum = (p, x) -> System.out.println(("Sum is " + (p + x)));
        printSum.accept(10, 20);

        // Multiple parameters, no return statement
        BiConsumer<Integer, Integer> printSum2 = (x, y) -> {
            System.out.println(("Sum is " + (x + y)));
        };
        printSum2.accept(15, 25);
    }

    public class SupplierPredicateExample
    {
        public void useSupplier()
        {
            Supplier<String> supplier = () -> "Laptop";

            // Predicate: tests is stock quantity is greater than 10
            Predicate<Integer> isStockSufficient = (quantity) -> quantity > 10;

            // The get() method of Supplier to retrieve the product
            String product = supplier.get();

        }
    }

}
