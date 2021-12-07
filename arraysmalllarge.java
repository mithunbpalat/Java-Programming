import java.util.*;
public class arraysmalllarge
{
    public static void main(String[] args)
    {
        int i,j,n,temp,b=0,c=2147483647;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter limit of array");
        n=sc.nextInt();
        int[] array= new int[n];
        for(i=0;i<n;i++)
        {
            j=i+1;
            System.out.println("Enter "+j+" array element of array");
            array[i]=sc.nextInt();
            if(array[i]>b)
            {
                b=array[i];
            }
            if(array[i]<c)
            {
                c=array[i];
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.println(array[i]);
        }
        System.out.println("Largest:"+b);
        System.out.println("Smallest:"+c);       
    }
}