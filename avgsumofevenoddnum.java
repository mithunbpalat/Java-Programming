import java.util.*;
public class avgsumofevenoddnum
{
    public static void main(String[] args)
    {
        int i,j,n,a,sumeven=0,sumodd=0,avgeven,avgodd,counteven=0,countodd=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter limit of numbers");
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            j=i+1;
            System.out.println("Enter "+j+" number");
            a=sc.nextInt();
            if(a%2==0)
            {
                sumeven=sumeven+a;
                counteven++;
            }
            if(a%2!=0)
            {
                sumodd=sumodd+a;
                countodd++;
            }
        }
        avgeven=(sumeven/counteven);
        avgodd=(sumodd/countodd);
        System.out.println("Sum of even numbers "+sumeven);
        System.out.println("Sum of odd numbers "+sumodd);
        System.out.println("Average of even numbers "+avgeven);
        System.out.println("Average of odd numbers "+avgodd);

    }
}