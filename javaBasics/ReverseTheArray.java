import java.util.*; 

class ReverseTheArray 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter the 5 numbers");
        for(int i=0;i<5;i++)
        {
         arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for(int i=arr.length-1;i>=0;i--)
         System.out.print(arr[i]+" ");
    }
}