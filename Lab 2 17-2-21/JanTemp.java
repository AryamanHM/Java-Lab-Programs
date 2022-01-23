import java.util.*;
class JanTemp
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[10][2],i,j,min=100,max=0,maxc=0,minc=0;
        System.out.println("Enter 10 city numbers then temperatures in January.");
        for(i=0;i<10;i++)
        {
            for(j=0;j<2;j++)
             {
                 if(j==0)
                 a[i][j]=sc.nextInt();
                 else
                 a[i][j]=sc.nextInt();
                }
            }
            for(i=0;i<10;i++)
        {
            if(a[i][1]>max)
            {
            max=a[i][1];
            maxc=i;
        }
             if(a[i][1]<min)  
             {
             min=a[i][1];
             minc=i;
            }
            }
            System.out.println("Highest Temperature="+max);
            System.out.println("City="+a[maxc][0]);
            System.out.println("Lowest Temperature="+min);
            System.out.println("City="+a[minc][0]);
        }
    }
            
            
        