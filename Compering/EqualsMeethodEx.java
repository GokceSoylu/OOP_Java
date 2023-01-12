package Compering;

public class EqualsMeethodEx 
{
    public static void main(String[] Soylu)
    {
        Worker w1=new Worker("ahmed",34);
        Worker w2=new Worker("ahmed",34);
        System.out.println(w1==w2);
        System.out.println(w1.equals(w2));
    }    
}
class Worker
{
    String name;
    int age;
    Worker(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public boolean equals(Object o)
    {
        if(o==this) return true;
        if(o==null || this.getClass()!=o.getClass() ) return false;
        return this.name==((Worker)o).name && this.age==((Worker)o).age;
    }
}
/*
    public boolean equals(Object o)
    {
        if(o==this) return true;
        if(o==null || this.getClass()!=o.getClass() ) return false;
        Worker w=(Worker)o;
        return this.name.equals(w.name) && this.age==w.age;
    }
 */