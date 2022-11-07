package ToString;

public class toString 
{
    public static void main(String[] Soylu)
    {
        Person p=new Person("ferudun",98);
        Animal a=new Animal("cat",4);

        System.out.println(p);
        System.out.println(a);
        System.out.println();//şimdi normalde toString() metodu sınıf adı@refnum gibi birşeyler yazdırıyor. Ancak biz bu metodu override
        //ederek farklı bir hale getirebiliyoruz. Bu toStirng metodu bir nevi objeyi yazdırmka oluyor. bir objenin birden fazla özelliği  vardı
        //görüldüğü gibi ints Strings etc. Tıpkı bir insanın olduğu gibi. ancak biz bir insanı boyu kilosu yada sahip olduğu başka özellikleriyle
        //değil ismiyle çağiririz ya onun gibi Bu to String() metoduda belli bir ifade döndürüyor. Kimi insanların lakabı olur artık isim yerine
        //onunla çağırırız ya bunun gibi override ederek bu metodu bizde farklı bir şekilde yazdırabiliriz:))

        Try t=new Try("kelile",2.0);//görüldüğü üzere override ettik. İsteğimiz işlemi yaptırabiliriz.
        for(int i=0;i<3;i++)
        {
            System.out.println(t);
            System.out.println();
        }    
    }    
}
class Person
{
    int age;
    String name;
    Person(String name, int age)
    {
        this.age=age;
        this.name=name;
    }
    public String toString()
    {
        return "name = "+name+"    age = "+age; 
    }
}
class Animal
{
    String kind;
    int foot;
    Animal(String kind, int foot)
    {
        this.kind=kind;
        this.foot=foot;
    }
}
class Try
{
    String str;
    double d;
    Try(String str, double d)
    {
        this.d=d;
        this.str=str;
    }
    public String toString()
    {
        System.out.println("d*d = "+d*d);
        d++;
        return str;
    }
}