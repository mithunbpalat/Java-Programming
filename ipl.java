import java.util.*;
public class ipl
{
    public static void main(String[] args)
    {
        int n,i,j,b,a=0,match=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of teams");
        n=sc.nextInt();
        char[][] newarray =new char[n][5];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter "+(i+1) +" team");
            for(j=0;j<4;j++)
            {
                newarray[i][j]=sc.next().charAt(0);
                if(newarray[i][j]=='q')
                {
                    break;
                }
            }
            a=a+1;
        }
        System.out.println("Teams are");
        for(i=0;i<n;i++)
        {
           System.out.println(" ");
           for(j=0;j<4;j++)
           {
           System.out.print(newarray[i][j]);
           }
        }
        b=a;
        while(a>0)
        {
            a--;
            match=match+a;
        }
        System.out.println("  ");
        System.out.println("Number of matches:"+match);
        a=0;
        System.out.println("  ");
        while(a<=(n-1))
        {
            for(b=a+1;b<n;b++)
            {
                for(j=0;j<4;j++)
                {
                    System.out.print(newarray[a][j]);
                }                
                System.out.print("-");
                for(j=0;j<4;j++)
                {
                    System.out.print(newarray[b][j]);
                }
                System.out.println("  ");
            }
            a++;
            b=a+1;
        }
    }
}