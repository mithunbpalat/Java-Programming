import java.util.*;
public class checkvowel
{
    public static void main(String[] args)
    {
        boolean isvowel=false;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter character");
        char ch=sc.next().charAt(0);
        switch(ch)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':isvowel=true;
        }        
        if(isvowel==true)
        {
            System.out.println(ch+" is a vowel");
        }
        else
        {
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') )
            {
                System.out.println(ch+" is a consonant");
            }
            else
            {
                System.out.println("Input is not an alphabet");
            }
        }
        
    }
}