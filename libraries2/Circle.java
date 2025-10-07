import java.util.*;

public class Circle implements Comparable {
    private double xRadius;
    private double yRadius;
    Circle(double xRadius,double yRadius)
    {
        this.xRadius=xRadius;
        this.yRadius=yRadius;
    }

    public double getXRadius()
    {
        return this.xRadius;
    }
    public double getYRadius()
    {
        return this.yRadius;
    }
    public void setXRadius(double xRadius)
    {
        this.xRadius=xRadius;
    }
    public void setYRadius(double yRadius)
    {
        this.yRadius=yRadius;
    }
    public double getArea()
    {
        return Math.PI*xRadius*yRadius;
    }
    @Override
    public int compareTo(Object that)
    {
        Circle thatIs = (Circle)that;
        if(this==that)
         return 0;
        if(this.xRadius==thatIs.xRadius && this.yRadius==thatIs.yRadius)
         return 0;
        if(this.xRadius>thatIs.xRadius && this.yRadius>thatIs.yRadius)
         return 1;
        
        return -1;
    }
    public static void main(String[] args)
    {
        Set<Circle> objects = new TreeSet<>();
        objects.add(new Circle(10,20));
        objects.add(new Circle(23,42));
        objects.add(new Circle(10,20));
        System.out.println(objects);
    }
}

