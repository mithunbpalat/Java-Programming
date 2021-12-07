import java.util.*;
public class binary
{
    public static void main(String[] args)
    {
        int n,i,j,temp,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of columns of array");
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter "+i+" array element");
            a[i]=sc.nextInt();

        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }

        }
        System.out.println("Descending order array elements are");
        for(i=0;i<n;i++)
        {        
            System.out.println(a[i]);
        }
        System.out.println("Enter the number to be found:");
        b=sc.nextInt();
        j=n/2;
        int c=2;
        for(i=0;i<n;i++)
        {
            if(a[0]==b)
            {
                System.out.println("Found");
                break;
            }
            if(a[9]==b)
            {
                System.out.println("Found");
                break;
            }
            if(b<=a[j+1])
            {
                j++;
                if(a[j]==b)
                {
                    System.out.println("Found");
                    break;
                }
                j=j+c;                
            }
            else if(b>=a[j])
            {
                if(a[j]==b)
                {
                    System.out.println("Found");
                    break;
                }
                j=j-c;                
            }
            c--;
        }
    }
}