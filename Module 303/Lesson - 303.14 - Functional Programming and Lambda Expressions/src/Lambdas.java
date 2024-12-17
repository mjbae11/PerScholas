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


}
