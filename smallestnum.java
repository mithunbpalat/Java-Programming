import java.util.*;
public class smallestnum
{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        a=sc.nextInt();
        System.out.println("Enter Second number");
        b=sc.nextInt();
        System.out.println("Enter Third number");
        c=sc.nextInt();
        if(a<b && a<c)
        {
            System.out.println("Smallest number is "+a);
        }
        else if(b<a && b<c)
        {
            System.out.println("Smallest number is "+b);
        }
        else if(c<a && c<b)
        {
            System.out.println("Smallest number is "+c);
        }
        
    }
}