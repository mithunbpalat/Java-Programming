import java.util.*;
public class textinput
{
    public static void main(String[] args)
    {
        int n,i,a=0,e=0,j=0,o=0,u=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of characters in text");
        n=sc.nextInt();
        char[] newarray =new char[n];
        System.out.println("Enter letters of text");
        for(i=0;i<n;i++)
        {
            newarray[i]=sc.next().charAt(0);
            if(newarray[i]=='q')
            {
                break;
            }
        }
        System.out.println("The text is");
        for(i=0;i<n;i++)
        {
            System.out.print(newarray[i]);
        }
        for(i=0;i<n;i++)
        {
            if(newarray[i]=='a' || newarray[i]=='A')
            {
                a=a+1;
            }
            if(newarray[i]=='e' || newarray[i]=='E')
            {
                e=e+1;
            }
            if(newarray[i]=='i' || newarray[i]=='I')
            {
                j=j+1;
            }
            if(newarray[i]=='o' || newarray[i]=='O')
            {
                o=o+1;
            }
            if(newarray[i]=='u' || newarray[i]=='U')
            {
                u=u+1;
            }
        }
        System.out.println("  ");
        if(a==0 && e==0 && j==0 && o==0 && u==0)
        {
            System.out.println(0);
        }
        if(newarray[0]==' ' || newarray[1]==' ' || newarray[2]==' ')
        {
            System.out.println("Invalid Input");
        }
        else
        {
            System.out.println("Vowels :a="+a+" e="+e+" i="+j+" o="+o+" u="+u);
        }
    }
}