import java.util.Scanner;
class sci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the principal: ");
    double principal = sc.nextDouble();
    System.out.print("Enter the rate: ");
    double rate = sc.nextDouble();
    System.out.print("Enter the time: ");
    double time = sc.nextDouble();
    System.out.print("Enter number of times interest is compounded: ");
    int number = sc.nextInt();
    double si=principal*rate*time/100;
double ci = principal * (Math.pow((1 + rate/100), (time * number))) - principal;
System.out.println("Principal: " + principal);
    System.out.println("Interest Rate= " + rate);
    System.out.println("Time Duration= " + time);
    System.out.println("Number of Time interest Compounded= " + number);
    System.out.println("Simple Interest="+si);
    System.out.println("Compound Interest= " + ci);
  }
}