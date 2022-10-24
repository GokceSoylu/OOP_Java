package Nasted_clases.AnanomysClases;

public class Greet 
{
    static int counter=0;
    public void say(int a)
    {
        for(int i=0;i<a;i++)
            System.out.println("Hi");
    }       
    public void counter()
    {
        counter++;
    }
    public void get_counter()
    {
        System.out.println("counter = "+counter);
    }
}
