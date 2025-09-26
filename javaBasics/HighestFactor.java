import java.util.*;

class HighestFactor 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt(); 
        int highFactor=0;
        for(int i=1;i*i<=number;i++)
        {
            if(number%i==0)
            {
                if(i>highFactor)
                 highFactor=i;
                if(i!=number/i && number/i!=number)
                 highFactor=number/i;
            }
        }
        System.out.println(highFactor);

    }
}