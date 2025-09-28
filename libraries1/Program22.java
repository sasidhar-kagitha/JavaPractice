import java.util.*;
public class Program22
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("please,give the input.");
        String input = sc.nextLine();
        for(int i=0;i<input.length();i++)
        {
            if(Character.isWhitespace(input.charAt(i)))
            {
                System.out.print(i+" ");
            }
        }
    }
}