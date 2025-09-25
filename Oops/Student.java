import java.util.*;

public class Student{

    private int admin_no;
    private String stu_name;
    private String course_joined;
    private double fees_paid;

    private final static double JAVA_FEE=10000;
    private final static double PYTHON_FEE=7500;

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

    public void setAdminNo(int admin_no)
    {
        this.admin_no=admin_no;
    }

    public void setStuName(String stu_name)
    {
        this.stu_name=stu_name;
    }

    public void setCourseJoined(String course_joined)
    {
        this.course_joined=course_joined;
    }

    public double getTotalFee()
    {
        if(this.course_joined=="JAVA")
          return JAVA_FEE;
        return PYTHON_FEE;
    }

    public double getDue()
    {
        if(this.course_joined=="JAVA")
            return (JAVA_FEE-this.fees_paid);
        return (PYTHON_FEE-this.fees_paid);
    }

    public double getFeePaid()
    {
        return this.fees_paid;
    }

    public void payment(double amount)
    {
        if(amount>=this.getDue())
        {
            this.fees_paid+=amount;
            System.out.println("Payment Done");
        }
        else{
            System.out.printf("%.2f requires",this.getDue()-amount);
        }
    }

    @Override
    public String toString()
    {
        return "\n admission_no: "+this.admin_no+"\nstudent name: "+this.stu_name+"\n course enrolled:" + this.course_joined+
        "\n fee paid: "+this.fees_paid;
    }
    //Testing the Student

    public static void main(String[] args)
    {
        Student s1=new Student(1201,"Raju","PYTHON",5000);
        System.out.println(s1);
        System.out.println("\ngetTotal Fee: "+s1.getTotalFee()+"\n fee Due: "+s1.getDue()+"\n feePaid: "+s1.getFeePaid());
        s1.payment(4000);

        Student s2=new Student(1202,"Maharshi",6000);
        System.out.println(s2);
        System.out.println("\ngetTotal Fee: "+s2.getTotalFee()+"\n fee Due: "+s2.getDue()+"\n feePaid: "+s2.getFeePaid());
        s2.payment(1000);


    }
 

}