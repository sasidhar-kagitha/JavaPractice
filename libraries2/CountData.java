import java.util.*;
import java.io.*;
public class CountData {

    public static void main(String[] args) throws IOException
    {
        int noOfUpperCases=0,noOfLowerCases=0,noOfDigits=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the file name");
        String fileName=sc.nextLine();
        FileReader fr=new FileReader(fileName);
        int data=fr.read();
        while(true)
        {
            if(data<0)
             break;
            char ch=(char)data;
            if(Character.isUpperCase(ch))
              noOfUpperCases+=1;
            if(Character.isLowerCase(ch))
                noOfLowerCases+=1;
            if(Character.isDigit(ch))
                noOfDigits+=1;
            data=fr.read();
        }
        System.out.println("\nuppercase letters: "+noOfUpperCases+"\nlowercase letters: "+noOfLowerCases+"\nDigits: "+noOfDigits);
    }
    
}