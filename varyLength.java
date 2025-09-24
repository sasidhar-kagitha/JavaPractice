import java.util.*;

class varyLength{
    public static void add(int... arr)
    {
        int sum=0;
        for(int i:arr)
        {
            sum+=i;
        }
        System.out.println(sum/arr.length);
    }
    public static void main(String[] args)
    {
        add(23,1,23,12,3);
    }
}