import java.util.*;

public class ArrayProgram
{
    public static void main(String[] args)
    {
        int[] arr=new int[10];
        int sum=0,avg;
        for(int i=0;i<10;i++)
        {
            arr[i]=(int)Math.floor(Math.random()*100);
            sum+=arr[i];
        }
        avg=sum/10;
        System.out.println(Arrays.toString(arr));

        for(int ele:arr)
        {
            if(ele>avg)
             System.out.print(ele+" ");
        }
    }
}