import java.util.*;
public class inputarray
{
    public static void main(String[] args)
    {
        int n,i;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter limit of the array");
        n=sc.nextInt();
        int[] newarray =new int[n];
        for(i=0;i<n;i++)
        {
            int j=i+1;
            System.out.println("Enter "+j +" array element");
            newarray[i]=sc.nextInt();
        }
        System.out.println("Array elements are");
        for(i=0;i<n;i++)
        {
            System.out.println(newarray[i]+" ");
        }
    }
}