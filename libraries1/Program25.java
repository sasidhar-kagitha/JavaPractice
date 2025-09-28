import java.util.*;
import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

public class Program24
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("enter two dates the starting and ending in this format dd-MM-yyyy ");
        LocalDate d1=LocalDate.parse(sc.nextLine(),df);
        LocalDate d2=LocalDate.parse(sc.nextLine(),df);
        System.out.println(d1);
        System.out.println(d2);
        long days = ChronoUnit.DAYS.between(d1,d2);
        System.out.println(days);

    }
}