import java.util.*;
public class arraymultiply
{
    public static void main(String[] args)
    {
        int i,j,n,sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter limit of 2 arrays");
        n=sc.nextInt();
        int[] firstarray= new int[n];
        int[] secondarray=new int[n];
        for(i=0;i<n;i++)
        {
            j=i+1;
            System.out.println("Enter "+j+" array element of first array");
            firstarray[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            j=i+1;
            System.out.println("Enter "+j+" array element of second array");
            secondarray[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            sum=sum+(firstarray[i]*secondarray[i]);
        }
        System.out.println("Sum is "+ sum);   
    }
}