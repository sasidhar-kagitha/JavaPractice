import java.util.*;
import java.io.*;
import java.util.stream.*;

public class SumTheMarks {
    public static void main(String[] args) throws Exception
    {
        try{
        Scanner sc = new Scanner(System.in);
        FileReader fr=new FileReader("Marks.txt");
        BufferedReader br=new BufferedReader(fr);
        String Line=br.readLine();
        while(Line!=null)
        {
            List<String> arr=Arrays.asList(Line.split(","));
            Integer sumIs= arr.stream().map(ele->Integer.parseInt(ele))
            .reduce(0,(a,b)->a+b);
            System.out.println(sumIs);
            Line=br.readLine();

        }
    }
    catch(Exception e)
    {
        System.out.print(e.getMessage());
    }

    }
}
