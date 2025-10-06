import java.util.*;

public class Product
{
    private String product_name;
    private int product_id;
    private double price;

    Product(String product_name,int product_id,double price)
    {
        this.product_id=product_id;
        this.product_name=product_name;
        this.price=price;
    }

    public double getPrice()
    {return price;}

    @Override
    public String toString()
    {
        return "\n product_name: "+this.product_name+"\n product_id: "+this.product_id+"\n price: "+this.price;
    }

}