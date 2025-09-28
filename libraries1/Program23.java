import java.util.*;
public class Program23
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        StringBuffer input =new StringBuffer(sc.nextLine());
        for(int i=0;i<input.length();i++)
        {
            if(Character.isUpperCase(input.charAt(i)))
            {
                input.setCharAt(i,Character.toLowerCase(input.charAt(i)));
            }
            else{
                input.setCharAt(i,Character.toUpperCase(input.charAt(i)));              
            }
        }

        System.out.println(input);

    }
}