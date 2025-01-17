package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnector {
    public static void main(String[] args) throws ClassNotFoundException {
        String dburl = "jdbc:mysql://localhost:3306/classicmodels";
        String user = "root";
        String password = "monkeyboy";
        System.out.println("-------- MySQL JDBC Connection Demo ------------");

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish the connection
            Connection connection = DriverManager.getConnection(dburl, user, password);

            // Test the connection by executing a simple query (e.g., SELECT 1)
            Statement stmt = connection.createStatement();
            ResultSet result = stmt.executeQuery("SELECT 1");

            // Check if the query executed successfully
            if (result.next()) {
                System.out.println("Connection test successful!");
            }

            // Query to fetch data from the employees table
            String selectSQL = "SELECT * FROM employees";
            result = stmt.executeQuery(selectSQL);

            // Display the employee data
            while (result.next()) {
                String employeeID = result.getString("employeeNumber");
                String fname = result.getString("firstName");
                String lname = result.getString("lastName");
                System.out.println(employeeID + " | " + fname + " | " + lname);
            }

            // Close the connection
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}