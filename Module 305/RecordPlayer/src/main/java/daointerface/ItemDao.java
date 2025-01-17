package daointerface;


import model.Item;

import java.util.List;

public interface ItemDao
{
    List<Item> getAllItems();
    void addItem(Item i);
    boolean removeItemById(int id);
}
