package Creat_obje;
public class ConstructerFromContructer 
{
    public static void main(String[] Soylu)
    {    
        Person_ p1=new Person_("hasn", "Can", 12, 01), p2=new Person_("İlber", "Ortayli");
        Person_ p3=new Person_(12), p4=new Person_(); //normalde üçüncü ve dördüncü contructerlar diğer fonklar çağirsin diye de biz yinede deneme amaçlı obje oluştorduk
        Person_[] ar = new Person_[]{p1,p2,p3,p4};
        for(Person_ p:ar)
            System.out.println(p.firstName+" "+p.lastName+" "+p.age+" "+p.id);
    }    
}
class Person_
{
    int id, age;
    String firstName, lastName;
    Person_(String firstName, String lastName, int age, int id)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.id=id;
        this.age=age;
    }
    Person_(String firstName, String lastName)
    {
        this();
        this.firstName=firstName;
        this.lastName=lastName;
    }
    Person_(int id)
    {
        this();
        this.id=id;
    }
    Person_()
    {
        firstName=null;
        lastName=null;
        age=0;
        id++;
    }
}
