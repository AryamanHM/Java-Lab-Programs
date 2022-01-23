import java.util.*;
import java.io.*;
public class array1
{
public static void main(String[] args)
{
int a[]=new int[10];
Scanner sc=new Scanner(System.in);
int i;
System.out.println("Enter the elements");
for(i=0;i<10;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<10;i++)
{
System.out.println(a[i]);
}
}
}

