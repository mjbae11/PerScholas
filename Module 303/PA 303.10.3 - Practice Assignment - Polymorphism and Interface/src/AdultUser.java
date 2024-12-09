public class AdultUser implements LibraryUser
{
    // Fields
    private int age;
    private String bookType;

    // Setters
    public void setAge(int age)
    {
        this.age = age;
    }

    public void setBookType(String bookType)
    {
        this.bookType = bookType;
    }

    // Implemented Methods    @Override
    public void registerAccount()
    {
        if (this.age >= 12)
        {
            System.out.println("You have successfully registered under a Adult Account");
        } else if (this.age <= 11 && this.age > 0)
        {
            System.out.println("Sorry, age must be greater than 12 to register as a Adult.");
        } else
        {
            System.out.println("Sorry, the age is invalid");
        }
    }

    @Override
    public void requestBook()
    {
        if (bookType != null && bookType.equalsIgnoreCase("Fiction"))
        {
            System.out.println("Book issued successfully, please return the book within 7 days");
        } else
        {
            System.out.println("Oops, you are allowed to take only adult Fiction books.");
        }
    }
}
