import java.util.*;
class Examcbc
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,sum=0,tsum=0,troll=0,stud1=0,stud2=0,stud3=0,max1=0,max2=0,max3=0;
        System.out.println("Enter number of students.Take 3 for now.");
        n=sc.nextInt();
        int a[][]=new int[n][4];
        System.out.println("Enter roll no then marks of students in 3 subjects.");
        for(i=0;i<n;i++)
        {
            for(j=0;j<4;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=1;j<4;j++)
            {
                sum+=a[i][j];
            }
            System.out.println("Sum of roll:"+a[i][0]+" Sum:"+sum);
            if(sum>tsum)
            {
            tsum=sum;
            troll=a[i][0];
        }
        sum=0;
        }
        for(i=0;i<n;i++)
        {
            if(a[i][1]>max1)
            {
                max1=a[i][1];
                stud1=a[i][0];
            }
            if(a[i][2]>max2)
            {
                max2=a[i][2];
                stud2=a[i][0];
            }
            if(a[i][3]>max3)
            {
                max3=a[i][3];
                stud3=a[i][0];
            }
            
        }
        System.out.println("In Subject 1 Max Marks:"+max1+" Roll="+stud1);
        System.out.println("In Subject 2 Max Marks:"+max2+" Roll="+stud2);
        System.out.println("In Subject 3 Max Marks:"+max3+" Roll="+stud3);
        System.out.println("In Overall Max Marks:"+tsum+" Roll="+troll);
    }
}
         