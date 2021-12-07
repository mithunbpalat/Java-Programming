import java.util.*;
public class twodimenarray
{
    public static void main(String[] args)
    {
        int n,i,j;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter limit of the array");
        n=sc.nextInt();
        int[][] newarray =new int[n][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                int a=j+1;
                System.out.println("Enter "+(i+1) +"row"+a +" array element");
                newarray[i][j]=sc.nextInt();
            }
        }
        System.out.println("Array elements are");
        for(i=0;i<n;i++)
        {
           for(j=0;j<n;j++)
           {
           System.out.println(newarray[i][j]+" ");
           }
        }
    }
}