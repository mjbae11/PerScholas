public class GMultipleDataType <T1, T2>
{
    // Fields
    T1 valueOne;
    T2 valueTwo;

    // Constructor
    public GMultipleDataType(T1 value1, T2 value2)
    {
        this.valueOne = value1;
        this.valueTwo = value2;
    }

    // getters and setters
    public T1 getValueOne()
    {
        return valueOne;
    }

    public void setValueOne(T1 valueOne)
    {
        this.valueOne = valueOne;
    }

    public T2 getValueTwo()
    {
        return valueTwo;
    }

    public void setValueTwo(T2 valueTwo)
    {
        this.valueTwo = valueTwo;
    }
}
