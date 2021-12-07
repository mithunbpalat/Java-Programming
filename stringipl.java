import java.util.*;
public class stringipl
{
    public static void main(String[] args)
    {
        int n,i,b,a=0,match=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of teams");
        n=sc.nextInt();
        String[] newarray =new String[n+1];
        for(i=0;i<n+1;i++)
        {
            System.out.println("Enter "+(i) +" team");
            newarray[i]=sc.nextLine();
            if(newarray[i]=="q")
            {
                break;
            }
            a=a+1;
        }
        sc.close();
        System.out.println("Teams are");
        for(i=0;i<n+1;i++)
        {
           System.out.println(" ");
           System.out.print(newarray[i]);
        }
        a--;
        b=n;
        while(a>0)
        {
            a--;
            match=match+a;
        }
        System.out.println("  ");
        System.out.println("Number of matches:"+match);
        a=1;
        System.out.println("  ");
        while(a<=(n))
        {
            for(b=a+1;b<n+1;b++)
            {
                System.out.print(newarray[a]);                            
                System.out.print("  X  ");
                System.out.print(newarray[b]);
                System.out.println("  ");
            }
            a++;
            b=a+1;
        }
    }
}