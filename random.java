import java.util.*;
public class random{
    public static void main(String[] args)
    {
        int x=(int)(Math.random()*101);
        System.out.println(x);
        if(x>=0 && x<25)
        System.out.println("Unlucky");
        else if(x>=25 && x<50)
        System.out.println("Better luck next time");
        else if(x>=50 && x<75)
        System.out.println(x*(x-2));
        else if(x>=75 && x<=100)
        System.out.println(x*(x+10));
    }
}