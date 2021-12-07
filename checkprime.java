import java.util.*;
public class checkprime{
    public static void main(String[] args)
    {
        int i,j=0,n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        n=sc.nextInt();
        for(i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                j=1;
                break;
            }
        }
        if(j==0)
        {
            System.out.println("Prime number");
        }
        else
        {
            System.out.println("Not prime number");
        }
    }
}