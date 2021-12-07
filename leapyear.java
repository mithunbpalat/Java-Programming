import java.util.*;
public class leapyear{
    public static void main(String[] args)
    {
        int year;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter year");
        year=sc.nextInt();
        boolean isleap=false;
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                    isleap=true;
                }
                else
                {
                    isleap=false;
                }
            }
            else
            {
                isleap=true;
            }
        }
        else
        {
            isleap=false;
        }
        if(isleap==true)
        {
            System.out.println(year+" is a leap year");
        }
        else
        {
            System.out.println(year+" is not a leap year");
        }
    }
}