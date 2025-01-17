package org.example;

import daointerface.CustomerDao;
import daointerface.ItemDao;
import daointerface.impl.CustomerDaoImpl;
import daointerface.impl.ItemDaoImpl;
import model.Customer;
import model.Item;
import service.RecordService;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        // records
//        RecordService recordService = new RecordService();
////        recordService.save();
//        recordService.deleteRecord();

        // customers
        CustomerDao customerDao = new CustomerDaoImpl();
        System.out.println("--------- inserting customer records ----------");
        // creating customers
        Customer c1 = new Customer();
        c1.setEmail("jeffbezos@gmail.com");
        c1.setFname("Jeff");
        c1.setLname("Bezos");
        customerDao.addCustomer(c1);

        Customer c2 = new Customer();
        c2.setEmail("elonmusk@gmail.com");
        c2.setFname("Elon");
        c2.setLname("Musk");
        customerDao.addCustomer(c2);

        Customer c3 = new Customer();
        c3.setEmail("markzuck@gmail.com");
        c3.setFname("Mark");
        c3.setLname("Zuck");
        customerDao.addCustomer(c3);


        //items
        ItemDao itemDao = new ItemDaoImpl();
        System.out.println("--------- inserting item records ----------");
        ArrayList<Item> items = new ArrayList<>();
        // creating items
        Item i1 = new Item();
        i1.setName("Noor");
        i1.setPrice(99.25);
        itemDao.addItem(i1);

        Item i2 = new Item();
        i2.setName("Mike");
        i2.setPrice(84.75);
        itemDao.addItem(i2);

        Item i3 = new Item();
        i3.setName("Gerald");
        i3.setPrice(54.01);
        itemDao.addItem(i3);
    }

}