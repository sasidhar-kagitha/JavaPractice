import java.util.*;

public class Employee{
    private String employee_name;
    private int emp_id;
    private double salary;

    Employee(int emp_id,String employee_name,double salary)
    {
        this.emp_id=emp_id;
        this.employee_name=employee_name;
        this.salary=salary;
    }

    Employee(int emp_id,String employee_name)
    {
        this.emp_id=emp_id;
        this.employee_name=employee_name;
    }

    public int getEmployeeId()
    {
        return this.emp_id;
    }

    public String getEmployeeName()
    {
        return this.employee_name;
    }

    public double getSalary()
    {
        return this.salary;
    }

    public void setEmployeeId(int emp_id)
    {
        this.emp_id=emp_id;
    }

    public void setEmployeeName(String name)
    {
        this.employee_name=name;
    }
    public void setSalary(double salary)
    {
        this.salary=salary;
    }

    @Override
    public String toString()
    {
        return "\nEmployee_id :"+getEmployeeId()+"\nEmployee_name :"+getEmployeeName()+"\nEmployee_salary :"+getSalary();
    }
    
}