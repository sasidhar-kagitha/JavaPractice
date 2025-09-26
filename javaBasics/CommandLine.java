import java.util.*;

class CommandLine
{
    public static void main(String[] args)
    {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int res=1;
        for(int i=1;i<=num2;i++)
        {
            res*=num1;
        }
        System.out.println(res);
    }
}