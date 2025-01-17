package daointerface.impl;

import daointerface.CustomerDao;
import model.Customer;
import utility.ConnectionDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDaoImpl extends ConnectionDAO implements CustomerDao
{
    @Override
    public List<Customer> getCustomerById(int id)
    {
        try {
            Connection connection = ConnectionDAO.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM customer");
            List customers = new ArrayList();
            while(rs.next())
            {
                Customer c = new Customer();
                c.setId( rs.getInt("id") );
                c.setEmail( rs.getString("email") );
                c.setFname( rs.getString("fname") );
                c.setLname( rs.getString("lname") );
                customers.add(c);
            }
            return customers;

        } catch (SQLException ex) {
            ex.printStackTrace();
            System.err.format("SQL State: %s\n%s", ex.getSQLState(), ex.getMessage());
        }
        return null;
    }

    @Override
    public void addCustomer(Customer c)
    {
        try {
            Connection connection = ConnectionDAO.getConnection();
            PreparedStatement ps = connection.prepareStatement("INSERT INTO customer (email, fname, lname) VALUES (?, ?, ?)");
            ps.setString(1, c.getEmail());
            ps.setString(2, c.getFname());
            ps.setString(3, c.getLname());
            int affectedRows = ps.executeUpdate();
            System.out.println(affectedRows + " row(s) affected !!");
        }
        // MIGHT THROW CLASS ERROR
        catch (SQLException e) {
            e.printStackTrace();
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        }
    }

    @Override
    public boolean removeCustomerById(int id)
    {
        try {
            Connection connection = ConnectionDAO.getConnection();
            PreparedStatement ps = connection.prepareStatement("DELETE FROM customer WHERE id=?");
            ps.setInt(1, id);
            int i = ps.executeUpdate();
            return i == 1;
        } catch (SQLException ex) {
            System.err.format("SQL State: %s\n%s", ex.getSQLState(), ex.getMessage());
        }
        return false;
    }
}
