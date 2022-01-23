package pack;
import mypack.*;
class X implements C
{
public void Draw()
{
System.out.println("This is 1st Draw function from Interface A.");
}
public void Draw2()
{
System.out.println("This is 2nd Draw function from Interface B.");
}
public void Draw3()
{
System.out.println("This is 3rd Draw function from Interface C.");
}
}
public class D
{
public static void main(String args[])
{
X a1=new X();
a1.Draw();
a1.Draw2();
a1.Draw3();
}
}