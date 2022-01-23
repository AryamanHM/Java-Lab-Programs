import java.util.*;
public class Multi{
  public static void main (String args[]){
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter a number : ");
    int n = sc.nextInt();
    if (n < 1) {
      throw new ArithmeticException("Kindly enter a number greater than 0");
    }
    else {
      int i;
      for (i=1;i<11;i++){
        System.out.println(n + "x" + i + "=" + n*i);
      }
    }
  }
}