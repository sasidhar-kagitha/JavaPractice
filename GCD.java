import java.util.*; 

class GCD{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        while(firstNumber!=0 && secondNumber!=0 && firstNumber!=secondNumber)
        {
            if(firstNumber>secondNumber)
            {
                firstNumber=firstNumber%secondNumber;
            }
            else{
                secondNumber=secondNumber%firstNumber;
            }
        }
        if(firstNumber==secondNumber)
         System.out.println("GCD :"+firstNumber);
        else if(firstNumber==0)
         System.out.println(s"GCD :"+econdNumber);
        else 
          System.out.println("GCD"+firstNumber);
    }
}