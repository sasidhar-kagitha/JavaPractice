import java.util.*;

public class Student{

    private int admin_no;
    private String stu_name;
    private String course_joined;
    private double fees_paid;

    Student(int admin_no,String stu_name,String course_joined,double fees_paid)
    {
        this.admin_no=admin_no;
        this.stu_name=stu_name;
        this.course_joined=course_joined;
        this.fees_paid=fees_paid;

    }

     Student(int admin_no,String stu_name,double fees_paid)
    {
        this.admin_no=admin_no;
        this.stu_name=stu_name;
        this.course_joined="JAVA";
        this.fees_paid=fees_paid;
    }

    public int getAdminNo()
    {
        return this.admin_no;
    }

    public String getStuName()
    {
        return this.stu_name;
    }

    public String getCourseJoined()
    {
        return this.course_joined;
    }




}