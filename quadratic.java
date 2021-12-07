import java.util.*;
public class quadratic
{
    public static void main(String[] args)
    {
        int a,b,c;
        double d,s1,s2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value of a");
        a=sc.nextInt();
        System.out.println("Enter value of b");
        b=sc.nextInt();
        System.out.println("Enter value of c");
        c=sc.nextInt();
        d=Math.sqrt(b*b-4*a*c);
        s1=(((-b)-d)/(2*a));
        s2=(((-b)+d)/(2*a));
        System.out.println("Solutions are "+s1+" and "+ s2);

    }
}