package utility;

import java.sql.*;

public class ConnectionDAO
{
    public static Connection con = null;
    protected PreparedStatement ps = null;
    protected ResultSet rs = null;

    public static Connection getConnection()
    {

            final String dburl = "jdbc:mysql://localhost:3306/recordstore";
            final String user = "root";
            final String password = "input password here";
        try
        {
            con = DriverManager.getConnection(dburl, user, password);
            System.out.println("Connected to the database successfully");

        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        return con;
    }

    public void disconnect()
    {
        try {
            if (rs != null) {
                rs.close(); // Close the ResultSet
            }
            if (ps != null) {
                ps.close(); // Close the Statement
            }
            if (con != null) {
                con.close(); // Close the Connection
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle any SQL exceptions
        }
    }
}
