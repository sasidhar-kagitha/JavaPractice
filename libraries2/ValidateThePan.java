import java.util.*;
import java.util.regex.*;
public class ValidateThePan {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Pan number");
        String panNo=sc.nextLine().toUpperCase();
        String pan_format="[A-Z]{3}[PCHABGJLFT][A-Z][0-9]{4}[A-Z]";
        Pattern pattern=Pattern.compile(pan_format);
        Matcher matcher = pattern.matcher(panNo);
        if(matcher.matches())
         System.out.println("PAN CARD IS VALID");
        else 
         System.out.println("INVALID PAN CARD NO");
    }
    
}
