import java.util.*;
class discriminant
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        double d=(b*b)-(4*a*c);
        System.out.println(d);
    }
}