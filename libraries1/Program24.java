import java.util.*;

public class Program24
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        StringBuilder res = new StringBuilder();
        String input;

        while (true) {
            input = sc.nextLine();
            if (input.equals("END"))
                break;
            if (res.length() > 0)
                res.append("-");
            res.append(input);
        }

        System.out.println(res.toString());
    }
}