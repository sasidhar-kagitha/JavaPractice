import java.util.*;

class commandLineTable
{
    public static void main(String[] args)
    {
        int num = Integer.parseInt(args[0]);
        int length = 10;

        if(args.length>1)
          length = Integer.parseInt(args[1]);
        
        for(int i=1;i<=length;i++)
        {
            System.out.println(num+"X"+i+"="+num*i);
        }
    }
}