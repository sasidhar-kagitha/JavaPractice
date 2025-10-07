import java.nio.file.*;

import java.util.*;

public class DisplayUniqueNamesFromTwoFiles {

    public static void main(String[] args)
    {
        try
        {
            Path path1=Paths.get("names1.txt");
            Path path2=Paths.get("names2.txt");
            List<String> names1=Files.readAllLines(path1);
            List<String> names2=Files.readAllLines(path2);
            names1.addAll(names2);
            LinkedHashSet<String> uniqNames = new LinkedHashSet<>(names1);
            System.out.println(uniqNames);

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}