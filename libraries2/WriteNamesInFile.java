import java.util.*;
import java.io.*;
public class WriteNamesInFile {
    public static void main(String[] args) throws FileNotFoundException
    {
        FileOutputStream fs=new FileOutputStream("names.txt");
        BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(fs));
        Scanner sc=new Scanner(System.in);
        try(fs){
            String name,exit;
            do
            {
                System.out.println("enter the name");
                name=sc.nextLine();
                bf.write(name);
                bf.newLine();
                System.out.println("END for exit");
                exit=sc.nextLine();


            }while(!exit.equals("END"));
            bf.flush();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
