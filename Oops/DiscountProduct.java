import java.util.*;

public class DiscountProduct extends Product
{
    private double discount_rate;

    DiscountProduct(int prod_id,String prod_name,double price,double discount_rate)
    {
        super(prod_id,prod_name,price);
        this.discount_rate=discount_rate;
    }

    public void setDiscountRate(double discount_rate)
    {
        this.discount_rate=discount_rate;
    }

    @Override 
    public double getNetPrice()
    {
        return getPrice()-(getPrice()*(discount_rate/100));
    }


    public void print()
    {
        System.out.println("\n Product_id: "+getProdId()+"\n Product_name: "+getProdName()+"\n basic_price:"+getPrice()+"\n net_price: "+getNetPrice());
    }


    //Testing the DiscountProduct

    public static void main(String[] args)
    {
        DiscountProduct p1=new DiscountProduct(1001,"Apple Watch",30000,15);
        p1.print();
        p1.setDiscountRate(20);
        p1.print();
    }

}