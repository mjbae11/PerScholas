public class Student extends Person implements Studyable
{
    private String typeOfMajor;

    // constructors
    public Student(String firstName, String lastName, int age, String typeOfMajor)
    {
        super(firstName, lastName, age);
        this.typeOfMajor = typeOfMajor;
    }

    @Override
    public void displayDetails()
    {
        System.out.println("Name: " + generateFullName());
        System.out.println("Age: " + getAge());
        System.out.println("Major: " + this.typeOfMajor);
    }

    @Override
    public void currentlyStudying()
    {
        System.out.println(generateFullName() + " is studying " + this.typeOfMajor);
    }
}
