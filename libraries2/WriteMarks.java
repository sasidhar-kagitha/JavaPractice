import java.util.*;
import java.io.*;
public class WriteMarks {

    public static void main(String[] args) throws Exception
    {
        try(Scanner sc=new Scanner(System.in);FileWriter fw=new FileWriter("Marks.txt",true);BufferedWriter bw=new BufferedWriter(fw))
        {
            String getLine="";
            System.out.println("enter the 20 marks");
            for(int i=0;i<20;i++)
            {
                if(i==19)
                 getLine+=sc.next();
                else 
                    getLine+=sc.next()+",";
            }
            bw.newLine();
            bw.write(getLine);
            bw.flush();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
