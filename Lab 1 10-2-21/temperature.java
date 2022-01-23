import java.util.*;
class temperature  
 {  
   public static void main (String args[])  
    { 
        Scanner sc=new Scanner(System.in);
        double Fahrenheit, Celsius;
        Celsius=sc.nextInt();  
          Fahrenheit =((Celsius*9)/5)+32;  
          System.out.println("Temperature in Fahrenheit is: "+Fahrenheit);  
    }}  