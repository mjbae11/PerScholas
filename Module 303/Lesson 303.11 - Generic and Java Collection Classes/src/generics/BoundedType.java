package generics;

import models.Customer;

public class BoundedType <T extends Customer>
{
    // will be a vipCustomer type
    private T value;

    public BoundedType(T value)
    {
        this.value = value;
    }

    // display the vip toString method
    public String getCustomerDetails()
    {
        return value.toString();
    }
}
