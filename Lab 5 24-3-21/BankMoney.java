package mypack3;
import mypack3.*;
import java.util.*;
class BankStuff implements BankInfo
{
int deposit;
public void Savings()
{
System.out.println("10% Interest for Savings Account.Limit is 5000.");
System.out.println("Account Created.");
}
public void Current()
{
System.out.println("25% Interest for Savings Account.Limit is 500.");
System.out.println("Account Created.");
}
}
public class BankMoney
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
BankStuff ob=new BankStuff();
System.out.println("Enter 1 for Savings Account,2 for Current Account.");
int choice=sc.nextInt();
if(choice==1)
{
ob.Savings();
}
else
{
ob.Current();
}
}
}



