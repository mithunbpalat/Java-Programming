import java.util.*;
public class printnum
{
    public static void main(String[] args)
    {
        int i,j,n,a;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter limit of numbers");
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            j=i+1;
            System.out.println("Enter "+j+" number");
            a=sc.nextInt();
        }
    }
}