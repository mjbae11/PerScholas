package daointerface.impl;

import daointerface.RecordDao;
import model.Records;
import utility.ConnectionDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RecordDaoImpl extends ConnectionDAO implements RecordDao
{
    @Override
    public List<Records> getAllRecords()
    {
        List <Records> recordList = new ArrayList();
        try
        {
            // set up connection stuff
            Connection connection = ConnectionDAO.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM records");
            // make list

            while (rs.next())
            {
                Records r = new Records();
                r.setCatalogNum(rs.getInt("catalogNum"));
                r.setRecordName(rs.getString("recordName"));
                recordList.add(r);
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        }
        return recordList;
    }

    @Override
    public void saveRecord(List<Records> recordsList)
    {
        try
        {
            Connection connection = ConnectionDAO.getConnection();
            int affectedRows = 0;
            for (Records r : recordsList)
            {
                String sqlQuery = "INSERT INTO records (catalogNum, recordName) VALUES (?,?)";
                PreparedStatement stmt = connection.prepareStatement(sqlQuery);
                stmt.setInt(1, r.getCatalogNum());
                stmt.setString(2, r.getRecordName());
                affectedRows += stmt.executeUpdate();
            }
            System.out.println(affectedRows + " rows affected");
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public boolean deleteRecord(int id)
    {
        try (
                Connection connection = ConnectionDAO.getConnection();
                PreparedStatement ps = connection.prepareStatement("DELETE FROM records WHERE id = ?");
        )
        {
            ps.setInt(1, id);
            int i = ps.executeUpdate();
            return i == 1;
        } catch (SQLException e)
        {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        }
        return false;
    }

    @Override
    public boolean updateRecord(Records record, int id)
    {
        try (
                Connection connection = ConnectionDAO.getConnection();
                PreparedStatement stmt = connection.prepareStatement("UPDATE records SET catalogNum = ? WHERE recordName = ? WHERE id = ?");
                )
        {
            ps.setInt(1, record.getCatalogNum());
            ps.setString(2, record.getRecordName());
            ps.setInt(3, id);
            int i = ps.executeUpdate();
            return i == 1;
        } catch (SQLException e)
        {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        }
        return false;
    }
}
