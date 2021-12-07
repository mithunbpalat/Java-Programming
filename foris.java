import java.util.*;
public class foris
{
    public static void main(String[] args)
    {
        int i,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        n=sc.nextInt();
        String[] b=new String[n+1];
        System.out.println("Enter text");
        for(i=0;i<n+1;i++)
        {
            b[i]=sc.nextLine();
        }
        sc.close();
        for(String j:b)
        {
            System.out.println(j);
        }
        for(i=0;i<n+1;i++)
        {
            System.out.println(b[i]);
        }
    }
}