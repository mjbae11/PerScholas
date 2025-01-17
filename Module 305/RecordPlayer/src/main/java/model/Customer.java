package model;

public class Customer
{
    private int id;
    private String email;
    private String fname;
    private String lname;

    // constructors


    public Customer()
    {
    }

    public Customer(String email, String fname, String lname)
    {
        this.email = email;
        this.fname = fname;
        this.lname = lname;
    }

    public Customer(String lname, String fname, String email, int id)
    {
        this.lname = lname;
        this.fname = fname;
        this.email = email;
        this.id = id;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getFname()
    {
        return fname;
    }

    public void setFname(String fname)
    {
        this.fname = fname;
    }

    public String getLname()
    {
        return lname;
    }

    public void setLname(String lname)
    {
        this.lname = lname;
    }

    @Override
    public String toString()
    {
        return "Customer{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                '}';
    }
}
