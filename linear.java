import java.util.*;
public class linear
{
    public static void main(String[] args)
    {
        int n,m,i,j,b,c=0,d,status=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows of array");
        n=sc.nextInt();
        System.out.println("Enter number of columns of array");
        m=sc.nextInt();
        int[][] a=new int[n][m];
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.println("Enter "+i+j+" array element");
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the element to be found");
        b=sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                if(b==a[i][j])
                {
                    status=1;
                    c=c+1;
                    System.out.println(c+" Position "+i+" row");
                    System.out.println(c+" Position "+j+" column");
                }
            }
        }
        System.out.println("  ");
        if(status==1)
        {
            System.out.println("Found "+b);
        }
        else
        {
            System.out.println("Not found");
        }
    }
}