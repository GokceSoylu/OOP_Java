package This;

public class Retur_obje 
{
    public static void main(String[] Soylu)
    {
        Person p1=new Person("Elif",35);
        Car c1=new Car(p1.get_refarance(),"opel insignia","black");// cool😎
        c1.get_info();
    }
}
class Car
{
    private String model, colour;
    private Person owner;
    Car(Person owner, String model, String colour)
    {
        this.colour=colour;
        this.owner=owner;
        this.model=model;
    } 
    public void get_info()
    {
        owner.get_info();
        System.out.println("the car model = "+model+"   the colour = "+colour);
    }
}
class Person
{
    private String name; 
    private int age;
    Person(String name, int age)
    {
        this.age=age;
        this.name=name;
    }
    public Person get_refarance()
    {
        return this;//!
    }
    public void get_info()
    {
        System.out.println("name "+name+"   age = "+age);
    }
}
