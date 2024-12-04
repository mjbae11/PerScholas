package model;

import abstracts.Animal;

public class Elephant extends Animal
{
    public Elephant(String name, int age)
    {
        super(name, age);
    }

    public void makeSound()
    {
        System.out.println("I'm an Elephant! BAHHH");
    }

    @Override
    public String toString()
    {
        return "Elephant{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
