public abstract class Person
{
    private String firstName;
    private String lastName;
    private int age;

    // constructor
    public Person(String firstName, String lastName, int age)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // getters and setters
    public int getAge()
    {
        return age;
    }

    public String generateFullName()
    {
        return this.firstName + " " + this.lastName;
    }

    public abstract void displayDetails();
}
