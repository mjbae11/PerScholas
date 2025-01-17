package org.example;

import java.sql.*;

public class HandsOn_Activity
{
    public static void main(String[] args)
    {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String dburl = "jdbc:mysql://localhost:3306/classicmodels";
        String user = "root";
        String password = "monkeyboy";

        try
        {
            con = DriverManager.getConnection(dburl, user, password);
            System.out.println("Connected to database\n");
            String sql1 = "SELECT * FROM employees WHERE officeCode = ? OR officeCode = ?";
            ps = con.prepareStatement(sql1);
            ps.setInt(1, 1);
            ps.setInt(2, 4);
            // execute the query
            rs = ps.executeQuery();
            System.out.println("---------------------------------------------------------");
            System.out.println("Query 1:");
            while (rs.next())
            {
                System.out.println(rs.getString("firstName") + " " + rs.getString("lastName") + ", Office Code: " + rs.getString("officeCode"));
            }

            String sql2 = "SELECT * FROM orderdetails WHERE orderNumber IN ( ? , ? )";
            ps = con.prepareStatement(sql2);
            ps.setInt(1, 10100);
            ps.setInt(2, 10102);
            rs = ps.executeQuery();
            System.out.println("---------------------------------------------------------");
            System.out.println("Query 2:");
            while (rs.next())
            {
                System.out.println(
                    rs.getString("orderNumber")
                    + " " + rs.getString("productCode")
                    + " " + rs.getString("quantityOrdered")
                    + " " + rs.getString("priceEach")
                    + " " + rs.getString("orderLineNumber")
                );
            }
            System.out.println("---------------------------------------------------------");
            System.out.println("Query 3:");
            String sql3 = "UPDATE employees SET extension = ? WHERE officeCode = ?";
            ps = con.prepareStatement(sql3);
            ps.setInt(1, 5698);
            ps.setInt(2, 2);

            int rowsAffected = ps.executeUpdate();
            ps = con.prepareStatement("SELECT * FROM employees WHERE officeCode = ?");
            ps.setInt(1, 2);
            // execute the query
            rs = ps.executeQuery();
            System.out.println(rowsAffected + " rows affected");
            while(rs.next())
            {
                System.out.println(
                    rs.getString("employeeNumber") + " " +
                    rs.getString("lastName") + " " +
                    rs.getString("firstName") + " " +
                    rs.getString("extension") + " " +
                    rs.getString("email") + " " +
                    rs.getString("officeCode") + " " +
                    "etc...");
            }
            System.out.println("---------------------------------------------------------");

        } catch (SQLException e)
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
