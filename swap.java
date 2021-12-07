import java.util.*;
public class swap
{
    public static void main(String[] args)
    {
        int temp,a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        a=sc.nextInt();
        System.out.println("Enter second number");
        b=sc.nextInt();
        temp=a;
        a=b;
        b=temp;
        System.out.println("Swaped numbers are: First number= "+a);
        System.out.println("Second number= "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Swaped numbers are: First number= "+a);
        System.out.println("Second number= "+b);
    }
}