import java.util.*;
class CommonFactorsMultiple
{
    public static boolean isItFactor(int factor,int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%factor!=0)
             return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of Elements");
        int n=sc.nextInt();
        System.out.println("enter the elements");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
         arr[i]=sc.nextInt(); 
        Arrays.sort(arr);
        System.out.print("common factors :");
        for(int i=1;i<=arr[0];i++)
        {
            if(isItFactor(i,arr))
            {
                System.out.print(i+" ");
            }
        }
        
    }
}