package model;
import jakarta.persistence.*;
import java.io.Serial;
import java.io.Serializable;
@Entity
@Table
public class Teacher implements Serializable
{
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int teacherId;
    private String salary;
    private String teacherName;

    public Teacher(String salary, String teacherName)
    {
        super();
        this.salary = salary;
        this.teacherName = teacherName;
    }

    public Teacher()
    {
    }

    public Teacher(String salary, String teacherName, Department department)
    {
        this.salary = salary;
        this.teacherName = teacherName;
    }

    public int getTeacherId()
    {
        return teacherId;
    }

    public void setTeacherId(int teacherId)
    {
        this.teacherId = teacherId;
    }

    public String getSalary()
    {
        return salary;
    }

    public void setSalary(String salary)
    {
        this.salary = salary;
    }

    public String getTeacherName()
    {
        return teacherName;
    }
}
