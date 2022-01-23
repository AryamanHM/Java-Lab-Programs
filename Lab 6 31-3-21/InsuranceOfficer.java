package defaultpackage;
import StarInsurance.*;
import java.util.*;
public class InsuranceOfficer 
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Amount and Time for Insurance.");
int l=sc.nextInt();
int t=sc.nextInt();
//System.out.println("Enter 1 for Life Insurance,2 for Health Insurance.");
//int choice=sc.nextInt();
//if(choice==1)
//{
Life ob1=new Life(l,t);
ob1.calculatePremium();
ob1.printable();
//}
//else
//{
//Health ob2=new Health(l,t);
//ob2.calculatePremium();
//ob2.printable();
}
}
