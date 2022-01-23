import java.io.IOException;  
import java.io.RandomAccessFile;  
  import java.util.*;
public class RAF {  
    static final String FILEPATH ="Student.TXT";  
    public static void main(String[] args) { 
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Student Number.");
    int n=sc.nextInt();
        try { 
        if(n==1)
        System.out.println(new String(readFromFile(FILEPATH, 0, 4)));
        if(n==2)
            System.out.println(new String(readFromFile(FILEPATH, 4, 6)));  
            else
            if(n==3)
            System.out.println(new String(readFromFile(FILEPATH, 10, 8))); 
            else if(n==4)
           System.out.println(new String(readFromFile(FILEPATH, 16, 8))); 
           else if(n==5)
           System.out.println(new String(readFromFile(FILEPATH, 22, 8))); 

        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
    private static byte[] readFromFile(String filePath, int position, int size)  
            throws IOException {  
        RandomAccessFile file = new RandomAccessFile(filePath, "r");  
        file.seek(position);  
        byte[] bytes = new byte[size];  
        file.read(bytes);  
        file.close();  
        return bytes;  
    }  
    private static void writeToFile(String filePath, String data, int position)  
            throws IOException {  
        RandomAccessFile file = new RandomAccessFile(filePath, "rw");  
        file.seek(position);  
        file.write(data.getBytes());  
        file.close();  
    }  
}  