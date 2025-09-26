import java.util.*;
class Wage
{
    public static void main(String[] args)
    {
        int noOfWorkingHours=0,day=0,amount=0,wage=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the working hours and day");
        noOfWorkingHours=sc.nextInt();
        day=sc.nextInt();
        amount=switch(day)
        {

            case 1,2,3->200;
            case 4,5->400;
            case 6->600;
            case 7->800; 
            default->0;
        };
        wage=(amount*noOfWorkingHours);
        if(wage>2000)
         wage+=wage*0.1;
        System.out.println("Wages is:"+wage);
    }
}