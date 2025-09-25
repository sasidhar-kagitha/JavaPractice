import java.util.*;

public class Product{

    private int prod_id;
    private String prod_name;
    private double price;
    private int quantity_on_hand;

    Product(int prod_id,String prod_name,double price,int quantity_on_hand)
    {
        this.prod_id=prod_id;
        this.prod_name=prod_name;
        this.price=price;
        this.quantity_on_hand=quantity_on_hand;
    }

    Product(int prod_id,String prod_name,double price)
    {
        this.prod_id=prod_id;
        this.prod_name=prod_name;
        this.price=price;
        this.quantity_on_hand=1;
    }

    Product(int prod_id,String prod_name)
    {
        this.prod_id=prod_id;
        this.prod_name=prod_name;
        this.quantity_on_hand=1;
    }

    public int getProdId()
    {
        return this.prod_id;
    }

    public void setProdId(int prod_id)
    {
        this.prod_id=prod_id;
    }

    public String getProdName()
    {
        return this.prod_name;
    }

    public void setProdName(String prod_name)
    {
        this.prod_name=prod_name;
    }

    public double getPrice()
    {
        return this.price;
    }

    public void setPrice(double price)
    {
        this.price=price;
    }

    public int getQuantityOnHand()
    {
        return this.quantity_on_hand;
    }

    public void setQuantityOnHand(int quantity_on_hand)
    {
        this.quantity_on_hand=quantity_on_hand;
    }

    public double getNetPrice()
    {
        return (this.price*0.12)+this.price;
    }

    public void purchase(int quantity)
    {
        this.quantity_on_hand +=quantity;
        System.out.printf("Success fully Purchased %d quantites of %s",quantity,this.prod_name);
    }

    public void sell(int noOfquantites)
    {
        this.quantity_on_hand-=noOfquantites;
        System.out.printf("Success fully Sold %d quantites of %s",noOfquantites,this.prod_name);
    }

    @Override
    public String toString()
    {
       return "\nProduct id: "+this.prod_id+"\nProduct name:"+this.prod_name+"\nprice:"+this.price+"\nNo Of Quantites:"+this.quantity_on_hand;
    }
    //Testing purpose 
    public static void main(String[] args)
    {
        Product p1=new Product(1,"Samsung Tv",30000);
        System.out.println(p1.toString());
        System.out.println("net price:"+p1.getNetPrice());
        p1.purchase(2);
        System.out.println(p1.toString());
        p1.sell(1);
        System.out.println(p1.toString());

        Product p2=new Product(2,"Apple Watch",16000,2); 
        System.out.println(p2.toString()); 

        Product p3=new Product(3,"Moto Mobile");
        System.out.println(p3);
    }
}