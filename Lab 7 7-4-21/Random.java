import java.util.*;
public class Random{
  public static void main (String args[]){
    Scanner sc = new Scanner (System.in);
    String[][] addressBook = new String[10][3];
    int i,z;
    String t;
    System.out.println("Enter the number of people you want enter : ");
    int n =  sc.nextInt();
    sc.nextLine();
    for (i=0;i<n;i++){
      System.out.print("Enter the name : ");
      addressBook[i][0]=sc.nextLine();
      System.out.println("Enter the contact number : ");
      addressBook[i][1]=sc.nextLine();
      System.out.print("Enter the age : ");
      t=sc.nextLine();
      z=Integer.parseInt(t);
      if (z > 100) {
      throw new ArithmeticException("Age must be less than 100");
    }
    else {
      addressBook[i][2] = t;
    }
    }
  }
}