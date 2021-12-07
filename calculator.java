import java.util.*;
public class calculator{
    public static void main(String[] args)
    {
        int a,b,ans;
        char operator;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        a=sc.nextInt();
        System.out.println("Enter second number");
        b=sc.nextInt();
        System.out.println("Enter operation");
        operator=sc.next().charAt(0);
        switch(operator)
        {
            case '+': ans=a+b;
                      System.out.println(ans);
                      break;
            case '-': ans=a-b;
                      System.out.println(ans);
                      break;
            case '*': ans=a*b;
                      System.out.println(ans);
                      break;
            case '/': ans=a/b;
                      System.out.println(ans);
                      break;
            default:System.out.println("Invalid Operation");
        }

    }
}