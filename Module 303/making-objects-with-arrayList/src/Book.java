public class Book
{
    private String title;
    private String author;
    private int pages;
    private int availableCopies;


    public Book(String title, String author, int pages)
    {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.availableCopies = 5;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public int getPages()
    {
        return pages;
    }

    public void setPages(int pages)
    {
        this.pages = pages;
    }

    public boolean borrowBook()
    {
        this.availableCopies--;
        if (this.availableCopies == 0)
        {
            System.out.println("out of copies");
        }
        return true;
    }

}
