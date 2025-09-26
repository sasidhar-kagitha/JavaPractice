import java.util.*;
import java.io.*;

public class Sample{
       public static int number;
	public static void main(String[] args) throws FileNotFoundException
	{
		System.out.println(number);
		PrintStream fileOut = new PrintStream("log.txt");
		System.setOut(fileOut);
  		System.out.println("Hello ");
                System.out.println("Your output stored in log.txt");
		fileOut.close();
	}
}
