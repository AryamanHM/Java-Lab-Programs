package StarInsurance;
// Abstract class
abstract class Insurance {
  // Abstract method (does not have a body)
  public abstract void calculatePremium();
}
interface Print
{  
void printable();  
}

// Subclass
class Health extends Insurance implements Print {
    int cost,time;
int p;
     Health(int a,int b)
{
cost=a;
time=b;
}
public void calculatePremium() {
System.out.println("You have chosen Health Insurance.");
    p=cost*time*2;
  }
public void printable()
{
System.out.println("Premium="+p);
}
     
  
}
// Subclass
class Life extends Insurance implements Print {
    int cost,time;
int p;
     Life(int a,int b)
{
cost=a;
time=b;
}
public void calculatePremium() {
System.out.println("You have chosen Life Insurance.");
    p=cost*time;
  }
public void printable()
{
System.out.println("Premium="+p);
}
     
  
}

