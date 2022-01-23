import java.util.*;
class TaxPayer
{
    int income;
    long ssn;
    TaxPayer()
    {
        ssn=0L;
        income=0;
    }
    TaxPayer(long a,int b)
    {
        ssn=a;
        income=b;
    }
    long getssn()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Social Security Number.");
        long x=sc.nextLong();
        return x;
    }
    int getincome()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Yearly gross income in Dollars.");
        int x=sc.nextInt(),amt;
        if(x>=10000 && x<=100000)
        amt=x;
        else
        {
        System.out.println("The gross income should be in the range from Rs.10000 to Rs.100,000.Try Again.");
        amt=getincome();
        }
        return amt;
    }
}
class UseTaxPayer 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of Taxpayer.E.g. 10,5");
        int n=sc.nextInt();
        long x;
        int y;
        TaxPayer[] a=new TaxPayer[n];
        for(int i=0; i< n;i++)
         a[i] = new TaxPayer();
        for(int i=0;i<n;i++)
        {
            x=a[i].getssn();
            y=a[i].getincome();
            a[i]=new TaxPayer(x,y);
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("Social Security Number="+a[i].ssn);
            System.out.println("Yearly Gross Income="+a[i].income);
        }
    }
}
        
