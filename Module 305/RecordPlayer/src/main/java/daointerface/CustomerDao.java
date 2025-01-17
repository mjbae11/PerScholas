package daointerface;

import model.Customer;

import java.util.List;

public interface CustomerDao
{
    List<Customer> getCustomerById(int id);
    void addCustomer(Customer c);
    boolean removeCustomerById(int id);
}
