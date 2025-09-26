import java.util.*;

class Pal
{
	public static boolean isPal(int num)
        {
		int rev=0,num1=num;
		while(num>0)
		{
			int rem=num%10;
			rev = rev*10+rem;
                        num/=10;
		}
		
		if(rev==num1)
			return true;
		return false;
        }
	public static void main(String[] args)
	{
	 System.out.println("Displaying the palindrome between 1000 to 2000");
	 for(int i=1000;i<=2000;i++)
	 {
		if(isPal(i))
                {
			System.out.println(i);
 		}  
	 }
	}
}
