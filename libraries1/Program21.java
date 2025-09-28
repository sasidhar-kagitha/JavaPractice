import java.util.*;

public class Program21
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks comma seperate");
        String input = sc.nextLine();
        String[] marks= input.split(",");
        int sum=0;
        for(String ele:marks)
        {
            sum+=Integer.parseInt(ele);
        }
        System.out.println("Sum of marks: "+sum);
    }
}