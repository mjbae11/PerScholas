package daointerface.impl;

import daointerface.ItemDao;
import model.Item;
import utility.ConnectionDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ItemDaoImpl extends ConnectionDAO implements ItemDao
{
    @Override
    public List<Item> getAllItems()
    {
        try {
            Connection connection = ConnectionDAO.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM item");
            List items = new ArrayList();
            while(rs.next())
            {
                Item i = new Item();
                i.setId( rs.getInt("id") );
                i.setName( rs.getString("name") );
                i.setPrice( rs.getDouble("price") );
                items.add(i);
            }
            return items;

        } catch (SQLException ex) {
            ex.printStackTrace();
            System.err.format("SQL State: %s\n%s", ex.getSQLState(), ex.getMessage());
        }
        return null;
    }

    @Override
    public void addItem(Item i)
    {
        try {
            Connection connection = ConnectionDAO.getConnection();
            PreparedStatement ps = connection.prepareStatement("INSERT INTO item (name, price) VALUES (?, ?)");
            ps.setString(1, i.getName());
            ps.setDouble(2, i.getPrice());
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
    public boolean removeItemById(int id)
    {
        try
        {
            Connection connection = ConnectionDAO.getConnection();
            PreparedStatement ps = connection.prepareStatement("DELETE FROM item WHERE id=?");
            ps.setInt(1, id);
            int i = ps.executeUpdate();
            return i == 1;
        } catch (SQLException ex) {
            System.err.format("SQL State: %s\n%s", ex.getSQLState(), ex.getMessage());
        }
        return false;
    }
}
