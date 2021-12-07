//import java.util.scanner;
public class balancecurrency{
    public static void main(String[] args)
    {
        int a,b,c,d,e,f,g,h,x,y,z,w,sum,t,num,m,n,o,p,q,r,s,m1,n1,o1,p1,q1,r1,s1;
        m=3; n=20; o=30; p=0; q=1; r=5; s=3;
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter total price of products:");
        num= sc.nextint();
        System.out.println("Enter the sum given:");
        sum= sc.nextint();
        t=sum-num;*/          
        /*
        Variable Explanations
        case1
        m- 3 nos =5rs-m1     5000=h
        n- 20 nos =1rs-n1      1000=g
        o- 13 nos =10rs-o1     500=f
        p- 13 nos =50rs-p1     100=a
        q- 7  nos =100rs-q1    50=b
        r- 5  nos =500rs-r1    10=c
        s- 3  nos =1000rs-s1   5=d
                               1=e
        case2
        100rs =1
        50rs  =0 
        10rs  =30
        
        case3
        100rs =2
        50rs  =0
        10rs  =30             */
        t=297;
        x=t%10;
        y=t%100; 
        y=y-x;
        z=t%1000;  
        z=z-y-x;
        w=t%10000;  
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
        s=s-g;  
        if(s<0)
        {
            s1=0;
            r=r-(2*g);
            if(r<0)
            {
                r1=0;
                q=q-(10*g);
                if(q<0)
                {
                    q1=0;
                    p=p-(20*g);
                    if(p<0)
                    {
                        p1=0;
                        o=o-(100*g);
                        if(o<0)
                        {
                            o1=0;
                            m=m-(200*g);
                            if(m<0)
                            {
                                m1=0;
                                n=n-(1000*g);
                            }
                        }
                    }
                }
            }
        s=0;
        }
        r=r-f;
        if(r<0)
        {
            r1=0;
            q=q-(5*f);
            if(q<0)
            {
                q1=0;
                p=p-(10*f);
                if(p<0)
                {
                    p1=0;
                    o=o-(50*f);
                    if(o<0)
                    {
                        o1=0;
                        m=m-(100*f);
                        if(m<0)
                        {
                            m1=0;
                            n=n-(500*f);
                        }
                    }

                }
            }
        r=0;
        }
        q=q-a;
        if(q==-1)
        {
            a=a-1;
        }
        if(q<0)
        {
            q1=0;
            p=p-(2*a);
            if(p<0)
            {
                p1=0;
                o=o-(10*a);
                if(o<0)
                {
                    o1=0;
                    m=m-(20*a);
                    if(m<0)
                    {
                        m1=0;
                        n=n-(100*a);
                    }
                }
            }
        q=0;
        a=a+1;
        }
        p=p-b;
        if(p<0)
        {
            p1=0;
            o=o-(5*b);
            if(o<0)
            {
                o1=0;
                m=m-(10*b);
                if(m<0)
                {
                    m1=0;
                    n=n-(50*b);
                }
            }
        p=0;
        }
        o=o-c;
        if(o<0)
        {
            o1=0;
            m=m-(2*c);
            if(m<0)
            {
                m1=0;
                n=n-(10*c);
            }
        o=0;
        }
        m=m-d;
        if(m<0)
        {
            m1=0;
            n=n-(5*d);
            m=0;
        }
        n=n-e;
        if(n<0)
        {
            n=0;
            System.out.println("No 1 rs currency");
        }
        System.out.println("1000="+g+" "+"500="+f+" "+"100="+a+" "+"50="+b+" "+"10="+c+" "+"5="+d+" "+"1="+e+" ");
        System.out.println("Remaining currencies: 1000="+s+" "+"500="+r+" "+"100="+(q+1)+" "+"50="+p+" "+"10="+(30-o)+" "+"5="+(3-m)+" "+"1="+(20-n)+" ");
    }
}