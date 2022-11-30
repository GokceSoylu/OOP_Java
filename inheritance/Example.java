/*
 * 
 */
package inheritance;
import java.util.*;
public class Example 
{
    public static void main(String[] Soylu)
    {
        Google g=new Google("s");
        System.out.println(g.getAdress()); 

        Apple a=new Apple();
        System.out.println(a.getAdress());     
    }
}
class Company
{
    String name;
    Company(String name)
    {
        this.name=name;
    }
    Company(){}
    String getAdress()
    {
        return name;
    }
    void print()
    {
        System.out.println(name);
    }
}
class Google extends Company
{
    Google(String name)
    {
        this.name=name;
    }
    String getAdress()
    {
        System.out.println("posword");
        Scanner in=new Scanner(System.in);
        int p=in.nextInt();
        if(p==1234)
            return name;
        else
            return "yanlis giris ";
    }
    void print()
    {
        System.out.println("the best company is "+name);
    }
    void doSomething()
    {
        System.out.println("googling...");
    }
}
class Microsoft extends Company
{
    Microsoft(String name)
    {
        super(name);
    }
    String getAdress()
    {
        System.out.println("posword");
        Scanner in=new Scanner(System.in);
        String p=in.nextLine();
        if(p.equals("mico"))
            return name;
        else
            return "yanlis giris ";
    }
}
class Apple extends Company
{
    String getAdress()
    {
        System.out.println("posword");
        Scanner in=new Scanner(System.in);
        String p=in.nextLine();
        if(p.equals("elma"))
            return name;
        else
            return "yanlis giris ";
    }
}