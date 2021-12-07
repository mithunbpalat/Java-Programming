import java.util.*;
public class operatorscalculator
{
    public void add(int a,int b)
    {
        int z=a+b;
        System.out.println("The sum is"+z);
    }
    public void subtract(int a,int b)
    {
        int z=a-b;
        System.out.println("The difference is"+z);
    }
    public void multiply(int a,int b)
    {
        int z=a*b;
        System.out.println("The product is"+z);
    }
    public void divide(int a,int b)
    {
        int z=(a/b);
        System.out.println("The quotient is"+z);
    }
    public static void main(String[] args)
    {
        int x,y;
        char operator;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First number:");
        x=sc.nextInt();
        System.out.println("Enter Second number:");
        y=sc.nextInt();
        System.out.println("Enter Operation:");
        operator=sc.next().charAt(0);
        operatorscalculator m=new operatorscalculator();
        switch(operator)
        {
            case '+':m.add(x,y);
                     break;
            case '-':m.subtract(x,y);
                     break;
            case '*':m.multiply(x,y);
                     break;
            case '/':m.divide(x,y);
                     break;
            default:System.out.println("Invalid operation");
        }
    }
}