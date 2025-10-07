import java.util.*;
import java.nio.file.*;
public class DisplayUniqueNames {

    public static void main(String[] args)
    {
        try{
            Path path=Paths.get("names.txt");
            List<String> names = Files.readAllLines(path);
            Set<String> uniqueNames=new TreeSet<>(names);
            System.out.println(uniqueNames);

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
