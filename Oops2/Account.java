import java.util.*;

class Account implements AccountOperations
{
    private int account_no;
    private String user_name;
    private double amount;
    Account(int account_no,String user_name,double amount)
    {
        this.account_no=account_no;
        this.user_name=user_name;
        this.amount=amount;
    }
    @Override 
    public double getBalance()
    {
        return this.amount;
    }

    @Override 
    public void deposit(double amount)
    {
        this.amount+=amount;
        System.out.println("Deposited successfully");
    }

    public void withdraw(double withdrawalAmount) throws InsufficientBalanceException
    {
       if(withdrawalAmount>amount)
        throw new InsufficientBalanceException(amount, withdrawalAmount);
       else 
       {
        this.amount-=withdrawalAmount;
        System.out.println("Successfully withdrawed");
       }
    }

    public static void main(String[] args)
    {
        Account user=new Account(101,"raju",40000);
        System.out.println(user.getBalance());
        user.deposit(23000);
        System.out.println(user.getBalance());
         /*user.withdraw(30000);
            user.withdraw(45000);*/
        try{
            user.withdraw(30000);
            user.withdraw(45000);

        }
        catch(InsufficientBalanceException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("Executed successfully");


    }
}