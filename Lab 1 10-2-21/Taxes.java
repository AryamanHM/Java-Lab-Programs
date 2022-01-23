import java.util.*;
class Taxes
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int s,i,t;
        double tax=0.00d;
        System.out.println("Enter 1 for Single,2 for Married Filing Jointly or Qualified Widow(er),3 for Married Filing Seperately and 4 for Head of Household");
        s=sc.nextInt();
System.out.println("Enter taxable income.");
        i=sc.nextInt();
        t=0;
        if(s==1)
        {
            if(i>=0 && i<=8350)
            t=10;
            else if(i>=8351 && i<=33950)
            t=15;
            else if(i>=33951 && i<=82250)
            t=25;
            else if(i>=82251 && i<=171550)
            t=28;
            else if(i>=171551 && i<=372950)
            t=33;
            else if(i>=372951)
            t=35;
        }
        else if(s==2)
        {
            if(i>=0 && i<=16700)
            t=10;
            else if(i>=16701 && i<=67900)
            t=15;
            else if(i>=67901 && i<=137050)
            t=25;
            else if(i>=137051 && i<=208850)
            t=28;
            else if(i>=208851 && i<=372950)
            t=33;
            else if(i>=372951)
            t=35;
        }
        else if(s==3)
        {
            if(i>=0 && i<=8350)
            t=10;
            else if(i>=8351 && i<=33950)
            t=15;
            else if(i>=33951 && i<=68525)
            t=25;
            else if(i>68525 && i<=104425)
            t=28;
            else if(i>=104426 && i<=186475)
            t=33;
            else if(i>=186476)
            t=35;
        }
        else if(s==4)
        {
            if(i>=0 && i<=11950)
            t=10;
            else if(i>=11951 && i<=45500)
            t=15;
            else if(i>=45501 && i<=117450)
            t=25;
            else if(i>=117451 && i<=190200)
            t=28;
            else if(i>=190201 && i<=372950)
            t=33;
            else if(i>=372951)
            t=35;
        }
            tax=t*i/100.00;
            System.out.println("Tax="+tax);
        }
    }