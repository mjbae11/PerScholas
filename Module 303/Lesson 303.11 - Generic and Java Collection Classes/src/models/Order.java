package models;

public class Order
{
    private int orderId;
    private String orderDetails;

    public Order(int orderId, String orderDetails)
    {
        this.orderId = orderId;
        this.orderDetails = orderDetails;
    }

    public int getOrderId()
    {
        return orderId;
    }

    public void setOrderId(int orderId)
    {
        this.orderId = orderId;
    }

    public String getOrderDetails()
    {
        return orderDetails;
    }

    public void setOrderDetails(String orderDetails)
    {
        this.orderDetails = orderDetails;
    }

    @Override
    public String toString()
    {
        return "models.models.Order{" +
                "orderId=" + orderId +
                ", orderDetails='" + orderDetails + '\'' +
                '}';
    }
}
