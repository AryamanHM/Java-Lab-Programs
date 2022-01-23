import java.util.*;
class Addressbook 
{
public String name,address,pro;
public int age,salary;
Addressbook()
{
name="";
pro="";
age=0;
salary=0;
}
public Addressbook(int age,int salary,String name,String address,String pro)
{
this.age=age;
this.salary=salary;
this.name=name;
this.address=address;
this.pro=pro;
}
public void Person()
    {
        System.out.println("Name:"+name);
System.out.println("Age:"+age);
System.out.println("Salary:"+salary);
System.out.println("Address:"+address);
System.out.println("Profession:"+pro);
        
    }
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter number of People. ");
  int n = sc.nextInt();
  int i,a,b;
String c,d,e;
Addressbook[] arr=new Addressbook[n];
for(i=0;i<n;i++)
{
System.out.println("Enter Name.");
c=sc.next();
System.out.println("Enter Age.");
a=sc.nextInt();
System.out.println("Enter Salary.");
b=sc.nextInt();
System.out.println("Enter Address.");
d=sc.nextLine();
sc.nextLine();
System.out.println("Enter Profession.");
e=sc.nextLine();
sc.nextLine();
  try {
   if(a >= 100) 
    throw new ArithmeticException("Age must be less than 100");
   else
    System.out.println("Valid age");
  }
  catch (ArithmeticException ex) {
   System.out.println(ex);
System.out.println("Enter Age again but less than 100.");
a=sc.nextInt();
  }
arr[i]=new Addressbook(a,b,c,d,e);
}
for(i=0;i<n;i++)
{
arr[i].Person();
}
}
}
