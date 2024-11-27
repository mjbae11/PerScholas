import java.util.ArrayList;

public class LibraryUser extends User
{

    private ArrayList<Book> borrowedBooks;

    public LibraryUser(String userName, String email)
    {
        super(userName, email);
        this.borrowedBooks = new ArrayList<>();
    }

    // method to borrow a book
    public void borrowBook(Book book)
    {
        if (book.borrowBook())
        {
            borrowedBooks.add(book);
            System.out.println("Book Borrowed: " + book);
        } else
        {
            System.out.println("Sorry, " + book.getTitle() + " is already borrowed.");
        }
    }

    public static void main(String[] args)
    {
        LibraryUser libraryUser = new LibraryUser("LibraryUser", "something@gmail.com");
        System.out.println(libraryUser);
    }
}