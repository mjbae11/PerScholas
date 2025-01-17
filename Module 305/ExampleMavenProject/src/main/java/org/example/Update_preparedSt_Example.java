package org.example;

import java.sql.*;
public class Update_preparedSt_Example
{
    public static void main(String[] args)
    {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String dburl = "jdbc:mysql://localhost:3306/classicmodels";
        String user = "root";
        // MAKE SURE TO CHANGE PASSWORD
        String password = "password";
        try
        {
            con = DriverManager.getConnection(dburl, user, password);
            System.out.println("Connected to database");
            String sql = "UPDATE employees SET firstName = ? , lastName = ? WHERE employeeNumber = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, "Gary");
            ps.setString(2, "Larson");
            ps.setLong(3, 0003);

            int rowsAffected = ps.executeUpdate();
            ps = con.prepareStatement("SELECT * FROM employees WHERE employeeNumber = ?");
            ps.setInt(1, 1401);
            // execute the query
            rs = ps.executeQuery();
            while (rs.next())
            {
                System.out.println(rs.getString("firstName"));
                System.out.println(rs.getString("lastName"));
                System.out.println(rs.getString("email"));
                System.out.println(rs.getString("officeCode"));
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        try {
            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
