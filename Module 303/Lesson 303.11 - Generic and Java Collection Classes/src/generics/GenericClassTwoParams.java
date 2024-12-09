package generics;

public class GenericClassTwoParams <T, S>
{
    private T data1;
    private S data2;

    public GenericClassTwoParams(T data1, S data2)
    {
        this.data1 = data1;
        this.data2 = data2;
    }

    public T getValue1()
    {
        return data1;
    }

    public S getValue2()
    {
        return data2;
    }

}
