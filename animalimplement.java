public class animalimplement implements animal
{
    public void eat()
    {
        System.out.println("Animal eats");
    }
    public void travel()
    {
        System.out.println("Animal travels");
    }
    public static void main(String[] args)
    {
        animalimplement m= new animalimplement();
        m.eat();
        m.travel();
    }
}