package MyBank1;
abstract class Loan {
  public abstract void carloan();
  public abstract void calculateLoan();
 
}


interface Print{  
void printDetails();  
} 

// Subclass (inherit from Loan) add in loan   public abstract void carloan();
class Car extends Loan implements Printable {
double loanc;
int timec,interestc,moneyc;
Car(int a,int b)
{
loanc=0.00d;
moneyc=a;
interestc=8;
timec=b;
}
  public void carloan() {
    System.out.println("This Loan applies to any 4 wheeled vehicle in your posession.");
    System.out.println("Tenure ranges from 1 to 10 years.Interest is 8%.");
}
public void calculateLoan()
{
loanc=moneyc+timec*(interestc*moneyc/100);
}
public void printDetails()
{
System.out.println("Car Loan="+loanc);
}
}