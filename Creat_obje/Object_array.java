package Creat_obje;

public class Object_array 
{
    public static void main(String[] Soylu)
    {
        Person[] p;//? bu henüz bir obje dizisi değil. Obje dizisi refaransı
        Person pp[];//todo refarans tutatn refarans gibi
        p=new Person[2];//? burada obje dizisi oluşturduk ve adresini refaransa atadık.
        pp=new Person[2];//todo artık refaransımız bir obje dizisiin adresini tutuyor
        p[0]=new Person(12,"hasan");//? şimdi ise dizinin içerisine yeni obje oluşturup atatdık
        p[1]=new Person(15,"tomris");//todo bu bşr refaranstı ve biz ona yeni obje oluşturu adresini adresini atadık
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