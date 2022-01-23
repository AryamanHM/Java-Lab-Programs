import java.util.*;
class ThreadA extends Thread{
int x;
ThreadA(int x)
{
this.x=x;
}
     public void run( ) {
double y=Math.toRadians(x);
double z=Math.sin(y);
System.out.print("p="+z);
     }
}

class ThreadB extends Thread {
   int x;
ThreadB(int x)
{
this.x=x;
}
     public void run( ) {
double y=Math.toRadians(x);
double z=Math.cos(y);
System.out.print("+"+z);
     }
}
class ThreadC extends Thread{
      int x;
ThreadC(int x)
{
this.x=x;
}
     public void run( ) {
double y=Math.toRadians(x);
double z=Math.tan(y);
System.out.print("+"+z);
     }
}

public class Trig {
    public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter value for x y and z in p = sin (x) + cos (y) + tan (z).");
int x=sc.nextInt();
int y=sc.nextInt();
int z=sc.nextInt();

         ThreadA a = new ThreadA(x);
         ThreadB b = new ThreadB(y);
         ThreadC c = new ThreadC(z);
         a.start();
         b.start();
         c.start();

    }
}