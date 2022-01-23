import java.util.*;
class MTech
{
    int roll,age;
    String name;
    double weight,height;
    MTech(int a,String b,int c,double d,double e)
    {
        roll=a;
        name=b;
        age=c;
        weight=d;
        height=e;
    }
    public void display()
    {
        System.out.println("Roll Number:"+roll);
        System.out.println("Name:"+name);
        System.out.println("Date of Birth(Age):"+age);
        System.out.println("Weight"+weight);
        System.out.println("Height"+height);
    }
    public void check()
    {
        
        if(age>=19 && weight>=75.00 && height<172.00)
        {
            System.out.println("Roll Number:"+roll);
        }
}
}
class MTechBox
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of students.E.g. 30,5");
        int n=sc.nextInt();
        int v,x;
        String w;
        double y,z;
        MTech[] a=new MTech[n];
        System.out.println("Enter Roll No,Name,DOB,Weight and Height.");
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Roll No.");
            v=sc.nextInt();
            System.out.println("Enter Name.");
            w=sc.next();
            System.out.println("Enter DOB(age).");
            x=sc.nextInt();
            System.out.println("Enter Weight");
            y=sc.nextDouble();
            System.out.println("Enter Height.");
            z=sc.nextDouble();
            a[i]=new MTech(v,w,x,y,z);
        }
        for(int i=0;i<n;i++)
        {
            a[i].display();
        }
        System.out.println("Roll Numbers numbers of the students  who are 19 years  old or more with weight above 75 kg but height less than 172 cm.");
        for(int i=0;i<n;i++)
        {
            a[i].check();
        }
    }
}