import java.util.*;
class div {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int quotient = num1 / num2;
        int remainder = num1 % num2;
        System.out.println("Quotient is: " + quotient);
        System.out.println("Remainder is: " + remainder);
    }
}