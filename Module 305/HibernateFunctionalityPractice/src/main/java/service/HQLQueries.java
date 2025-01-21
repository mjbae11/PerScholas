package service;

import jakarta.persistence.TypedQuery;
import model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class HQLQueries
{
    public static void getStudents() {
        // Initialize SessionFactory and Session
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        try {
            // Define HQL query to fetch all Student entities
            String hql = "FROM Student"; // "Student" is the name of the entity class
            TypedQuery<Student> query = session.createQuery(hql, Student.class);

            // Execute the query and get results
            List<Student> results = query.getResultList();

            // Loop through and display the students
            for (Student s : results) {
                System.out.println(
                        "Student ID: " + s.getId() +
                                " | First Name: " + s.getFirstName() +
                                " | Last Name: " + s.getLastName() +
                                " | Email: " + s.getEmail()
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close session and factory
            session.close();
            factory.close();
        }
    }

    public static void getMajorOfGIS() {
        // Initialize SessionFactory and Session
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        try {
            // Define HQL query to fetch all Student entities
            String hql = "FROM Student WHERE major = \"Biology\""; // "Student" is the name of the entity class
            TypedQuery<Student> query = session.createQuery(hql, Student.class);

            // Execute the query and get results
            List<Student> results = query.getResultList();

            // Loop through and display the students
            for (Student s : results) {
                System.out.println(
                        "Student ID: " + s.getId() +
                                " | First Name: " + s.getFirstName() +
                                " | Last Name: " + s.getLastName() +
                                " | Email: " + s.getEmail()
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close session and factory
            session.close();
            factory.close();
        }
    }

    public static void useNamedQuery() {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        try {
            // Begin transaction
            session.beginTransaction();

            // Get Named Query
            Query query = session.getNamedQuery("findmajor");
            query.setParameter("major", "Aviation");

            // Execute and retrieve results
            List<Student> students = query.getResultList();
            students.forEach(student ->
                    System.out.println("ID: " + student.getId() + ", Major: " + student.getMajor())
            );

            // Commit transaction
            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}
