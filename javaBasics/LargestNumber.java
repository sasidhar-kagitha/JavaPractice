import java.util.*;

public class LargestNumber 
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter 10 numbers");

    int larg=0;
    for(int i=0;i<10;i++)
    {
        if(i==0)
         larg=sc.nextInt();
        else{

            int num = sc.nextInt();
            if(num>larg)
             larg=num;
        }
    }
    System.out.println("System out println"+larg);
    }
}