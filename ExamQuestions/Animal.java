package ExamQuestions;
class  Main_Qustion1
{
    public static void main(String[] Soylu)
    {
        Duck duffy=new Duck();
        Fish nemo=new Fish();
        duffy.swim();
        nemo.move();

        Animal a =new Duck();
        a.move();
       //Flayable f=(Flyable)new Fish();
        Flayable f=new Duck();
        f.fly();
        ((Animal)f).move();
        ((Swimmable)f).swim();
    }
}
interface Swimmable
{
    void swim();
}
interface Flayable
{
    void fly();
}
public abstract class Animal 
{
    abstract void move();
}
class Fish extends Animal implements Swimmable
{
    void move()
    {
        System.out.println("fish can move by swimming :))");
    }  
    public void swim()
    {
        System.out.println("fish can swim");
    } 
}
class Duck extends Animal implements Swimmable, Flayable
{
    void move()
    {
        System.out.println("duck can move");
    }
    public void swim()
    {
        System.out.println("duck can swim");
    }
    public void fly()
    {
        System.out.println("duck can fly");
    }
}
