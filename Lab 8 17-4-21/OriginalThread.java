import java.util.*;
class Thread1 extends Thread
{
int n;
Thread1(int n)
{
this.n=n;
}

public void run()
{

int d,sum=0;

while(n!=0)
{
d=n%10;
sum=sum*10+d;
n=n/10;
}
System.out.println("Reverse of Number="+sum);
}
}
class Thread2 extends Thread
{
int m;
Thread2(int m)
{
this.m=m;
}
public void run()
{

int i,fact=1;

for(i=1;i<=m;i++)
fact=fact*i;
System.out.println("Factorial="+fact);
}
}
public class OriginalThread
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,m;
System.out.println("Enter a Number to Reverse a Number.");
n=sc.nextInt();
System.out.println("Enter a Number to find Factorial.");
m=sc.nextInt();
Thread1 t1 = new Thread1(n);
t1.start();
Thread2 t2 = new Thread2(m);
t2.start();

}
}