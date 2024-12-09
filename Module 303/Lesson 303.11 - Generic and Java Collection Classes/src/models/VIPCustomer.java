package models;

public class VIPCustomer extends Customer
{

    private String vipLevel;
    public VIPCustomer(int id, String name, String vipLevel)
    {
        super(id, name);
        this.vipLevel = vipLevel;
    }

    public String getVipLevel()
    {
        return vipLevel;
    }

    public void setVipLevel(String vipLevel)
    {
        this.vipLevel = vipLevel;
    }

    @Override
    public String toString()
    {
        return "VIPCustomer{" +
                "vipLevel='" + vipLevel + '\'' +
                '}';
    }
}
