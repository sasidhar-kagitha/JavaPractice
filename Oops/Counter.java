import java.util.*; 

public class Counter{
    private int count;

    Counter()
    {
        this.count=0;
    }

    Counter(int startCount)
    {
        this.count=startCount;
    }

    public int getCountValue()
    {
        return this.count;
    }

    public int increment()
    {
        this.count+=1;
        return this.count;
    }
    public int decrement()
    {
        this.count-=1;
        return this.count;
    }

    //Testing the Counter 

    public static void main(String[] args)
    {
        Counter c1=new Counter();
        Counter c2=new Counter(100);
        System.out.println("C1 incremented"+c1.increment());
        System.out.println("C1 incremented"+c1.increment());
        System.out.println("C1 decremented"+c1.decrement());

        System.out.println("C2 incremented"+c2.increment());




        
    }
}