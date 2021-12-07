//import java.util.scanner;
public class currencynumber{
    public static void main(String[] args)
    {
        int a,b,c,d,e,f,g,h,x,y,z,w,sum,n,num;
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter total price of products:");
        num= sc.nextint();
        System.out.println("Enter the sum given:");
        sum= sc.nextint();
        n=sum-num;*/
        n=297;
        x=n%10;
        y=n%100; 
        y=y-x;
        z=n%1000;  
        z=z-y-x;
        w=n%10000;  
        w=w-z-y-x;
        if(x>=5)
        {
            d=1;
            x=x-5;
            e=x;
        }
        else
        {
            d=0;
            e=x;
        }
        if(y>=50)
        {
            b=1;
            y=y-50;
            y=y/10;
            c=y;
        }
        else
        {
            b=0;
            y=y/10;
            c=y;
        }
        if(z>=500)
        {
            f=1;
            z=z-500;
            z=z/100;
            a=z;
        }
        else
        {
            f=0;
            z=z/100;
            a=z;
        }
        if(w>=5000)
        {
            h=1;
            w=w-5000;
            w=w/1000;
            g=w;
        }
        else
        {
            h=0;
            w=w/1000;
            g=w;
        }
        System.out.println("1000="+g+" "+"500="+f+" "+"100="+a+" "+"50="+b+" "+"10="+c+" "+"5="+d+" "+"1="+e+" ");
    }
}