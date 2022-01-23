public class Sum
{
public static void main(String[] args)
{
int[] x=new int[10];
for(int i=0;i<x.length;i++)
x[i]=i;
int sum=0;
for(int i=0;i<x.length;i++)
sum+=x[i];
System.out.println(sum);
}
}