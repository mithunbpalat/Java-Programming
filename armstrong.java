import java.util.*;
public class armstrong
{
    public static void main(String[] args)
    {
        int a,c=0,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        temp=n;
        while(n>0)
        {
            a=n%10;
            c=c+(a*a*a);
            n=n/10;
        }
        if(temp==c)
        {
            System.out.println("Armstrong number");
        }
        else
        {
            System.out.println("Not armstrong number");
        }
    }
  
}