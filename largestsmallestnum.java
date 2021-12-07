import java.util.*;
public class largestsmallestnum
{
    public static void main(String[] args)
    {
        int a,b=2147483647,c=0,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter limit of numbers");
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter number");
            a=sc.nextInt();
            if(a<b)
            {
                b=a;
            }
            if(a>c)
            {
                c=a;
            }
        }
        System.out.println("Smallest: "+b);
        System.out.println("Largest: "+c);
    }
}