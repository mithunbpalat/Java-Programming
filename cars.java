import java.util.*;
public class cars{
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        n=sc.nextInt();
        String[] car =new String[n+1];
        System.out.println("Enter car names");
        for(int i=0;i<n+1;i++)
        {
            car[i]=sc.nextLine();
        }
        sc.close();
        for(String i:car)
        {
            System.out.println(i);
        }
        System.out.println("  ");
        for(int i=0;i<n+1;i++)
        {
            System.out.println(car[i]);
        }
   }    
}