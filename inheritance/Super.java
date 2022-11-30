package inheritance;

public class Super 
{
    public static void main(String [] Soylu)
    {
        C c=new C();
        A a= new A();
        a.print(); 
    }
}
class A
{    
    void print()
    {
        System.out.println("from A");
        B b1=new B();
        b1.print();
    }
    
}
class B extends A
{
    void print()
    {
        System.out.println("from B");
    }
}
class C extends B
{
    C()
    {
        super.print();
    }
}