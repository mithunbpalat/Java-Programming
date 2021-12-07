import java.util.*;
public class ascendingarray
{
    public static void main(String[] args)
    {
        int n,i,j,temp;
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
                if(a[i]<a[j])
                {
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }

        }
        System.out.println("Ascending order array elements are");
        for(i=0;i<n;i++)
        {        
            System.out.println(a[i]);
        }
        
    }
}