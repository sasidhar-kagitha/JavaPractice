import java.nio.file.*;
import java.util.*;
public class ConvertToUpperCase {
    public static void main(String[] args)
    {
        try{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the filename");
        String fileName=sc.nextLine();
        Path path=Paths.get(fileName);
        String content = Files.readString(path);
        Files.writeString(path,content.toUpperCase());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
