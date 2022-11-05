package Creat_obje;

public class Object_array 
{
    public static void main(String[] Soylu)
    {
        Person[] p;
        Person pp[];
        p=new Person[2];
        pp=new Person[2];
        p[0]=new Person(12,"hasan");
        p[1]=new Person(15,"tomris");
        pp[0]=p[0];
        pp[1]=p[1];

        Person[] p2={new Person(10,"elif"), new Person(98,"kemal")};

        for(Person each:p)
            System.out.printf("%nname = %s   age = %d",each.name, each.age);
        System.out.println();

        for(Person each:pp)
            System.out.printf("%nname = %s   age = %d",each.name, each.age);
        System.out.println();

        for(Person each:p2)
            System.out.printf("%nname = %s   age = %d",each.name, each.age);
    }
}    
class Person
{
    int age;
    String name;
    Person(int a, String n)
    {
        age=a;
        name=n;
    }
}