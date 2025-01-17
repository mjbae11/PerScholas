package model;

public class Records
{
    private int id;
    private int catalogNum;
    private String recordName;

    public Records()
    {
        this.id = 0;
        this.catalogNum = 0;
        this.recordName = "";
    }

    public Records(int catalogNum, String recordName)
    {
        this.catalogNum = catalogNum;
        this.recordName = recordName;
    }

    public Records(int id, int catalogNum, String recordName)
    {
        this.id = id;
        this.catalogNum = catalogNum;
        this.recordName = recordName;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getCatalogNum()
    {
        return catalogNum;
    }

    public void setCatalogNum(int catalogNum)
    {
        this.catalogNum = catalogNum;
    }

    public String getRecordName()
    {
        return recordName;
    }

    public void setRecordName(String recordName)
    {
        this.recordName = recordName;
    }

    @Override
    public String toString()
    {
        return "model.Records{" +
                "id=" + id +
                ", catalogNum=" + catalogNum +
                ", recordName='" + recordName + '\'' +
                '}';
    }
}
