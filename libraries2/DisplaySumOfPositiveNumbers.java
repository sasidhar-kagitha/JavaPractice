
import java.util.*;
import java.util.stream.*;

public class DisplaySumOfPositiveNumbers {
    
    public static void main(String[] args)
    {
        List<Integer> nums=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        String ch;
        do{
            System.out.println("Enter the number");
            Integer ele=sc.nextInt();
            nums.add(ele);
            System.out.println("O for exit");
            ch=sc.next();
        }while(!ch.equals("O"));
        Integer val=nums.stream().filter(num->num>0)
        .reduce(0,(a,b)->a+b);
        System.out.println(val);

    }
}
