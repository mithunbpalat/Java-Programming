import java.util.*;
public class arraylength
{
    public static void main(String[] args)
    {
        int i,j,n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter limit of array");
        n=sc.nextInt();
        int[] array= new int[n];
        for(i=0;i<n;i++)
        {
            j=i+1;
            System.out.println("Enter "+j+" array element of array");
            array[i]=sc.nextInt();
        }
        System.out.println(array[2]);
        //System.out.println(array.length());

    }
}