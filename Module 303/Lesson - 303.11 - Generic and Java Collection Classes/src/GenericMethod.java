public class GenericMethod <T>
{
    private T value;

    public GenericMethod(T value)
    {
        this.value = value;
    }

    public T getValue()
    {
        return value;
    }

    public void setValue(T value)
    {
        this.value = value;
    }

    public void createArray()
    {
        T[] genericArray = (T[]) new Object[10];
        Integer[] array = {1, 2, 3};
        String[] strArray = {"A", "B", "C"};
    }

    public void printArray(T[] array)
    {
        for (T element : array)
        {

        }
    }
}
