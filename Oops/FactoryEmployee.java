import java.util.*;

public class FactoryEmployee extends Employee
{
    private int bus_no;
    private String emp_boards;

    FactoryEmployee(int emp_id,String emp_name,double salary,int bus_no,String emp_boards)
    {
        super(emp_id,emp_name,salary);
        this.bus_no=bus_no;
        this.emp_boards=emp_boards;
    }

    FactoryEmployee(int emp_id,String emp_name,int bus_no,String emp_boards)
    {
        super(emp_id,emp_name);
        this.bus_no=bus_no;
        this.emp_boards=emp_boards;
    }

    public int getBusNo()
    {
        return this.bus_no;
    }

    public void setBusNo(int bus_no)
    {
        this.bus_no=bus_no;
    }

    public String getEmpBoards()
    {
        return this.emp_boards;
    }

    public void setEmpBoards(String emp_boards)
    {
        this.emp_boards=emp_boards;
    }

    @Override
    public String toString()
    {
        return super.toString()+
        "\nBus_No: "+getBusNo()+"\nBoard :"+getEmpBoards();
    }

    @Override 
    public boolean equals(Object e)
    {
        if(this==e)
            return true;
        FactoryEmployee e1=(FactoryEmployee)e;
        if(e1.bus_no==this.bus_no  && e1.emp_boards==this.emp_boards)
         return true;

        return false;
    }

    @Override
    public int hashCode()
    {
        return bus_no;
    }

    //Testing the Factory Employee Class;
    public static void main(String[] args)
    {
        FactoryEmployee emp1=new FactoryEmployee(101,"Sai",50000,2,"Madhurawada");
        System.out.println(emp1.toString());

        FactoryEmployee emp2=new FactoryEmployee(102,"Rakesh",2,"Madhurawada");
        System.out.println(emp2.toString());

        System.out.println(emp1.equals(emp2)+" "+emp1.hashCode());
    }
}