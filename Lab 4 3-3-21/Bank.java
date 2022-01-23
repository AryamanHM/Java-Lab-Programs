import java.util.*;
class Customer
{
    String name,accNo,type;
    int balance;
    Customer(String a,String b,String c,int d)
    {
        name=a;
        accNo=b;
        type=c;
        balance=d;
    }
    void display()
    {
        System.out.println("Name of Customer="+name);
        System.out.println("Account Number="+accNo);
        System.out.println("Account type="+type);
        System.out.println("Balance="+balance);
}
}
class WD extends Customer
{
     WD(String a,String b,String c,int d)
     {
        super(a,b,c,d);
    }
    void choice()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 to withdraw,2 to deposit,3 to check account balance..");
        int choice=sc.nextInt();
        if(choice==1)
        withdraw();
        else if(choice==2)
        deposit();
        else
        check();
    }
    void withdraw()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sum to be withdrawn.");
        int w=sc.nextInt();
if(w>balance){
System.out.println("Insufficient Money in Account.Try Again.");
w=0;
}
        balance=balance-w;
        System.out.println("Withdrawal="+w);
    }
    void deposit()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sum to be DEPOSITED.");
        int d=sc.nextInt();
        balance=balance+d;
        System.out.println("Deposit="+d);
    }
    void check()
    {
        System.out.println("Balance="+balance);
    }
    
}
class Bank 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a,b,c;
        int d,choicex=1;
        System.out.println("Enter Name.");
        a=sc.next();
        System.out.println("Enter Account Number.");
        b=sc.next();
        System.out.println("Enter Account Type.");
        c=sc.next();
        System.out.println("Enter Balance in bank account.");
        d=sc.nextInt();
////savings=500,current=5000
if(c=="Savings" && d<500)
{
System.out.println("Insufficient Amount.Please deposit atleast 500 to open Savings Account.");
d=sc.nextInt();
}
if(c=="Savings" && d<5000)
{
System.out.println("Insufficient Amount.Please deposit atleast 5000 to open Current Account.");
d=sc.nextInt();
}
        WD ob=new WD(a,b,c,d);
        ob.display();
        while(choicex!=0)
        {
        ob.choice();
        System.out.println("Do you want to continue?1 for Yes,0 for No.");
        choicex=sc.nextInt();
    }
}   
}