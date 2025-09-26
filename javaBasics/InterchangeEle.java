import java.util.*;

class InterchangeEle {
    public static void main(String[] args)
    {
        int[] arr=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 10 numbers");
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            int temp =arr[i];
            arr[i]=arr[i+5];
            arr[i+5]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}