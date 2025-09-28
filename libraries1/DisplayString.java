import java.util.*;

public class DisplayString{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();
        System.out.println(s);
        for(int i=0;i<s.length();i++)
        {
            System.out.println(s.charAt(i));
        }
    }
}