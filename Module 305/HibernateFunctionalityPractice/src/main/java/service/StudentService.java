package service;

import model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

;

public class StudentService
{
    public static void createTable()
    {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        tx.commit();
        factory.close();
        session.close();
        System.out.println("Table created");
    }

    public static void addStudents()
    {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        Student stu1 = new Student();
        stu1.setFirstName("John");
        stu1.setLastName("Doe");
        stu1.setEmail("john@doe.com");
        stu1.setMajor("Biology");

        Student stu2 = new Student();
        stu2.setFirstName("Jane");
        stu2.setLastName("Doe");
        stu2.setEmail("jane@doe.com");
        stu2.setMajor("Chemistry");

        Student stu3 = new Student();
        stu3.setFirstName("Mike");
        stu3.setLastName("Bae");
        stu3.setEmail("mike@bae.com");
        stu3.setMajor("GIS");
        session.persist(stu1);
        session.persist(stu2);
        session.persist(stu3);

        tx.commit();
        System.out.println("Students added");
        session.close();
        factory.close();
    }

    public static void findAllStudent()
    {

    }

    public static void updateStudent()
    {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        Student s = new Student();
        s.setId(3);
        s.setFirstName("bruh");
        s.setLastName("123456");
        s.setEmail("mhaseeb@perscholas");

        session.merge(s);
        tx.commit();
        System.out.println("Students added");
        session.close();
        factory.close();
    }

    public static void deleteStudent()
    {

    }


}
