import java.util.*;
class House
{
    double price,rent;
    House(double a,double b)
    {
        price=a;
        rent=b;
    }
}
class RentedHouse extends House
{
    RentedHouse(double a,double b)
    {
        super(a,b);
    }
    public double owner()
    {
        return ((0.80/100)*price);
    }
    public double renter()
    {
        return ((20.00/100)*rent);
    }
}
class HouseBox2
{
     public static void main(String[] args)
        {
        Scanner sc=new Scanner(System.in);
        double p,r,t,tax=0.00d;
        int x,choice=1;
        System.out.println("Enter total value of the property.");
        p=sc.nextDouble();
        System.out.println("Enter rent value of the property.");
        r=sc.nextDouble();
        RentedHouse ob=new RentedHouse(p,r);
        while(choice!=0)
        {
            System.out.println("Press 1 if owner occupied the house,2 if it was a rented property.");
            x=sc.nextInt();
            if(x==1)
            {
                t=ob.owner();
                tax=tax+t;
            }
            else
            {
                t=ob.renter();
                tax=tax+t;
            }
            System.out.println("You want to evaluate for next year,press 1 else press 0 to end taxing procedure.");
            choice=sc.nextInt();
        }
        System.out.println("Tax="+tax);
    }
}
