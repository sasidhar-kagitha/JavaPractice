import java.util.*;

public class Perfect 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sumOfFactors = 0;
        for(int i=1;i*i<=num;i++)
        {
            if(num%i==0)
            {
                sumOfFactors+=i;
                int anotherFactor = num/i;
                if(i!=anotherFactor && anotherFactor!=num)
                  sumOfFactors+=anotherFactor;
            }
        }
        if(sumOfFactors==num)
        {
            System.out.println(num+"is a perfect number");
        }
        else{
            System.out.println(num+"isn't a perfect number");
        }
    }
}