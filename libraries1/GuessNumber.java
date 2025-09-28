import java.util.*;

public class GuessNumber{
    public static void main(String[] args)
    {
        int guess_number_is=(int)Math.ceil(Math.random()*25);
        System.out.println("Guess the number.Number in 1 between 25");
        boolean game_result=false;
        Scanner sc=new Scanner(System.in);

        for(int i=1;i<=3;i++)
        {
            System.out.println("you left "+(4-i)+" chances."+"enter a number");
            int number=sc.nextInt();
            if(number==guess_number_is)
            {
                System.out.println("you won the match");
                game_result=true;
                break;
            }

        }
        if(game_result==false)
        {
            System.out.println("you loose the match");
        }
    }
}