import java.util.*;

public class SortProducts
{
    public static void main(String[] args)
    {
        List<Product> products=new ArrayList<>();
        products.add(new Product("Apple Watch",102,20000));
        products.add(new Product("One Plus",101,25000));
        products.add(new Product("Smart TV",103,30000));
        products.add(new Product("Smart AC",104,40000));
        System.out.println(products.get(0).getPrice());
        Collections.sort(products,(a,b)->a.getPrice()<b.getPrice()?1:0);
        System.out.println(products);

    }
}