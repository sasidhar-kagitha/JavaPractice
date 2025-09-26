import java.util.*;

public class ImportedProduct extends Product
{
    private double import_duty;

    ImportedProduct(int prod_id,String prod_name,double price,double import_duty)
    {
        super(prod_id,prod_name,price);
        this.import_duty=import_duty;
    }

    public void setImportDuty(double import_duty)
    {
        this.import_duty=import_duty;
    }

    @Override 
    public double getNetPrice()
    {
        return (getPrice()*(import_duty/100)+getPrice());
    }

    public void print()
    {
        System.out.println("\n Product_id: "+getProdId()+"\n Product_name: "+getProdName()+"\n basic_price:"+getPrice()+
        "\n net_price: "+getNetPrice());
    }

    //Testing the ImportedProduct

    public static void main(String[] args)
    {
        /*ImportedProduct p1=new ImportedProduct(1001,"Apple Watch",30000,15);
        p1.print();
        p1.setImportDuty(20);
        p1.print();*/
        Product p1=new ImportedProduct(1001,"Apple Watch",30000,15);
        System.out.println(p1.getNetPrice());
        System.out.println(p1.toString());
        ImportedProduct op=(ImportedProduct)p1;
        op.print();
    }


}