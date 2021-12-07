public class Subclass extends Superclass
{
    Subclass(int x,int y)
    {
        super(x,y);
        int addition=x+y;
        System.out.println("Sum:"+addition);
    }
    public static void main(String[] args)
    {
        Subclass s=new Subclass(10,5);
    }
}