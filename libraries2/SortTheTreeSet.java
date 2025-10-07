import java.util.*;

public class SortTheTreeSet {

    public static void main(String[] args)
    {
        Set<String> arr=new TreeSet<>((a,b)->{
            if(a.length()==b.length())
               return 0;
            if(a.length()>b.length())
             return -1;
            return 1;
        });
        arr.add("Hi");
        arr.add("Welcome");
        arr.add("Hello");
        arr.add("Rakesh");
        arr.add("Hi");
        System.out.println("sorting by length");
        System.out.println(arr);
        
        
    }
    
}
