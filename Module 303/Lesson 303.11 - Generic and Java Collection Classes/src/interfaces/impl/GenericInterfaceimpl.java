package interfaces.impl;

import interfaces.GenericInterface;

public class GenericInterfaceimpl<T> implements GenericInterface<T>
{
    @Override
    public void display(T value)
    {
        System.out.println("Value: " + value);
    }
}
