package pkg;
import mypack2.*;
import java.util.*;
class PetrolEngine implements Engine
{
public void Start1()
{
System.out.println("starting engine...");
}
public void Stop1()
{
System.out.println("stopping engine...");
}
}
public class PetrolLelo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
PetrolEngine ob=new PetrolEngine();
ob.Start1();
System.out.println("Enter Speed of Vehicle.");
double speed=sc.nextDouble();
System.out.println("Enter Distance Covered by Vehicle.");
double dist=sc.nextDouble();
double fuel=dist/speed;
System.out.println("Fuel Usage="+fuel+" litres.");
ob.Stop1(); 
}
}



