import java.util.*;
public class primenum
{
    public static void main(String[] args)
    {
        int i,j,n,num=3,status=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        if(n>=1)
        {
            System.out.println("First "+n+" prime numbers are:");
            System.out.println(2);
        }
        for(i=2;i<n;)
        {
            for(j=2;j<=Math.sqrt(num);j++)
            {
                if(num%j==0)
                {
                    status=0;
                    break;
                }
            }
            if(status!=0)
            {
                System.out.println(num);
                i++;
            }
            status=1;
            num++;
        }
    }
}