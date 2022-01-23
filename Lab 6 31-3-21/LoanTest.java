package UseLoan;
import MyBank.*;
import java.util.*;
public class LoanTest
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Loan Amount and Time needed.");
int l=sc.nextInt();
int t=sc.nextInt();
Home ob=new Home(l,t);
ob.homeloan();
ob.calculateLoan();
ob.printDetails();
}
}