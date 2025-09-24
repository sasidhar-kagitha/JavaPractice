import java.util.*;

class AverageOfFive 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the five numbers");
        int sum=0;
        for(int i=0;i<5;i++)
         sum+=sc.nextInt();
        System.out.println(sum/5);
    }
}