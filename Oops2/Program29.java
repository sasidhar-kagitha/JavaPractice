import java.util.*;

public class Program29
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the five values");
        try{
            int total=0;
            for(int i=0;i<5;i++)
            {
              total+=Integer.parseInt(sc.next());
    
            }
            System.out.println(total);
        }
        catch(NumberFormatException e)
        {
            System.out.println(e.getClass());
        }
        catch(Exception e)
        {
            System.out.println(e.getClass());
        }
    }
    
}