import java.util.*;

class Reverse{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        while(number>0)
        {
            System.out.print(number%10);
            number/=10;
        }
    }
}