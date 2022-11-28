package inheritance;
//todo hocam ilginçtir ama child class parantin private field'ına ulaşamaz. private sadece sınıf scobu içerininde ulaşılabilirdir :))
public class First 
{
    public static void main(String[] Soylu)
    {
        Human h1=new Human(23,68,"Necmiye");
        Engineer e1=new Engineer(1000,23,68,"Necmiye");
        System.out.println(h1.getWeight());
        System.out.println(e1.getWeight());
        e1.eat();
        h1.eat();
        System.out.println(h1.getWeight());
        System.out.println(e1.getWeight());
    }
}
class Human
{
    int age;
    String name;
    int weight;
    Human(){}
    Human(int age, int weight, String name)
    {
        this.name=name;
        this.age=age;
        this.weight=weight;

    }
    void eat()
    {
        weight++;
    }
    int getWeight()
    {
        return weight;
    }
}
class Engineer extends Human
{
    int salary;

    Engineer(int salary, int age, int weight, String name)
    {
        super(age,weight,name);
        this.salary=salary;
    }
    void eat()
    {
        weight+=2;
    }
}