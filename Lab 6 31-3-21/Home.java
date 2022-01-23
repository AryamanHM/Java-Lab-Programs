package MyBank;
abstract class Loan {
  
  public abstract void homeloan();

  public abstract void calculateLoan();
 
}


interface Print{  
void printDetails();  
} 

// Subclass (inherit from Loan)
public class Home extends Loan implements Print{
double loanh;
int timeh,interesth,moneyh;
public Home(int a,int b)
{
loanh=0.00d;
moneyh=a;
interesth=15;
timeh=b;
}
  public void homeloan() 
{
    // The body of homeloan() is provided here
    System.out.println("This Loan applies to any place assets in your posession.");
    System.out.println("Tenure ranges from 1 to 30 years.Interest is 15%.");
  }
public void calculateLoan()
{
loanh=moneyh+timeh*(interesth*moneyh/100);
}
public void printDetails()
{
System.out.println("Home Loan="+loanh);
}
}

