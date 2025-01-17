package service;

import daointerface.RecordDao;
import daointerface.impl.RecordDaoImpl;
import model.Records;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecordService
{
    private final RecordDao recordDao;

    public RecordService()
    {
        this.recordDao = new RecordDaoImpl();
    }

    public void getAllRecords()
    {
        List<Records> records = recordDao.getAllRecords();
        System.out.println("All Records");

        for (Records record : records)
        {
            System.out.println("Catalog Number: " + record.getCatalogNum() + ", Record Name: " + record.getRecordName());
        }
    }

    public void save()
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Records> recordList = new ArrayList<>();

        System.out.println("Enter amount of records you would like to enter: ");
        int numberOfRecords = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfRecords; i++)
        {
            Records record = new Records();
            System.out.println("Enter catalog number for Record " + (i + 1) + ": ");
            record.setCatalogNum(Integer.parseInt(scanner.nextLine()));

            System.out.println("Enter record name for Record " + (i + 1) + ": ");
            record.setRecordName(scanner.nextLine());
            recordList.add(record);
        }
        recordDao.saveRecord(recordList);
        scanner.close();
        System.out.println("Records save successfully!");
    }

    public void updateRecord()
    {
        try (Scanner scanner = new Scanner(System.in))
        {
            Records updateRecord = new Records();

            System.out.println("Enter the catalog Number of the record to update: ");
            int catalogNumber = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter new record name: ");
            updateRecord.setRecordName(scanner.nextLine());
            updateRecord.setCatalogNum(catalogNumber);
            recordDao.updateRecord(updateRecord, catalogNumber);
            System.out.println("Records update successfully!");
        }
    }

    public void deleteRecord()
    {
        try (Scanner scanner = new Scanner(System.in))
        {
            System.out.println("Enter the Record ID that you would like to delete: ");
            int recordID = Integer.parseInt(scanner.nextLine());

            recordDao.deleteRecord(recordID);
            System.out.println("Record delete successfully!");
        }
    }
}
