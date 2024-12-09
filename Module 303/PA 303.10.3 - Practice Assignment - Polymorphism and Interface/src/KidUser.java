public class KidUser implements LibraryUser
{
    // Fields
    private int age;
    private String bookType;

    // Set age and Set bookType

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setBookType(String bookType)
    {
        this.bookType = bookType;
    }

    // Implemented Methods
    @Override
    public void registerAccount()
    {
        if (this.age <= 11 && this.age > 0)
        {
            System.out.println("You have successfully registered under a Kids Account");
        } else if (this.age > 11)
        {
            System.out.println("Sorry, age must be less than 12 to register as a kid.");
        } else
        {
            System.out.println("Sorry, the age is invalid");
        }
    }

    @Override
    public void requestBook()
    {
        if (bookType != null && bookType.equalsIgnoreCase("Kids"))
        {
            System.out.println("Book issued successfully, please return the book within 10 days");
        } else
        {
            System.out.println("Oops, you are allowed to take only kids books.");
        }
    }
}
