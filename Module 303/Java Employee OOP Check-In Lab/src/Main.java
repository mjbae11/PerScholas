public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        Employee dude1 = new Employee("Mike", "Bae", "something", 0.50);
        Employee dude2 = new Employee("Jorge", "Alvarez", "something", 65.99);
        Employee dude3 = new Employee("DR", "Martin", "the second", 5.00);
        System.out.println(dude1.calculateWeeklySalary());
        System.out.println(dude2.calculateWeeklySalary());
        System.out.println(dude3.calculateWeeklySalary());
        System.out.println(dude1);
        System.out.println(dude2);
        System.out.println(dude3);
        System.out.println(dude1.equals(dude2));


    }

}
