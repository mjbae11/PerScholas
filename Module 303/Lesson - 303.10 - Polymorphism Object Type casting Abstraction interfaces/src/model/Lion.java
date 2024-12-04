package model;

import abstracts.Animal;

public class Lion extends Animal
{
    public Lion(String name, int age)
    {
        super(name, age);
    }

    @Override
    public void makeSound()
    {
        System.out.println("Im a Lion! ROARRR :3");
    }

    @Override
    public String toString()
    {
        return "Lion{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
