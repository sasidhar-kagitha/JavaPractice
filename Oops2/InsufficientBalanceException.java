import java.util.*;

public class InsufficientBalanceException extends RuntimeException
{
    private double availableAmount,withdrawAmount;
    InsufficientBalanceException(double availableAmount,double withdrawAmount)
    {
        this.availableAmount=availableAmount;
        this.withdrawAmount=withdrawAmount;
    }

    public String getMessage()
    {
        return "insufficient Balance "+availableAmount+"for withdrawal of "+withdrawAmount;
    }


}