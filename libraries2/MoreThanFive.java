import java.util.*;

import java.io.*;

public class MoreThanFive 
{
    public static void main(String[] args) throws IOException
    {
        FileReader fr=new FileReader("read.txt");
        BufferedReader br=new BufferedReader(fr);
        String Line=br.readLine();
        while(Line!=null)
        {
            if(Line.length()>5)
             System.out.println(Line);
            /*if(Line==null)
              break;*/
            
            Line=br.readLine();
        }
    }
}