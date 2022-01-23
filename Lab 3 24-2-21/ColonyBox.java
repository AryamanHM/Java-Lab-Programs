import java.util.Scanner;
class Colony {
  int door;
  double plot;
  String datecon;
 Colony(int a,double b,String c) {
    door=a;
    plot=b;
    datecon=c;
  }
 public void display()
 {
     System.out.println("Door Number:"+door);
     System.out.println("Total ground area of the plot:"+plot);
     System.out.println("Date of Construction:"+datecon);
}
}
 class ColonyBox {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter Door Number: ");
    int x=sc.nextInt();
    System.out.print("Please enter Ground area: " );
    double y = sc.nextDouble();  
    System.out.print("Please enter Date of Construction: " );
    String z=sc.next();  
    sc.nextLine();
    Colony ob=new Colony(x,y,z);
    ob.display();
}
}