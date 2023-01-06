package Interface;

class Main_
{
    public static void main(String[] Soylu)
    {
        Duck duck=new Duck();
        Dog dog=new Dog();
        Cat cat=new Cat();
        Animal[] animal_array=new Animal[]{duck, dog, cat};
        for(Animal itr:animal_array)
            if(itr instanceof Swimmable)
                ((Swimmable)itr).swim();
    }
}

class Duck extends Animal implements Swimmable, Moveable, Flyable
{
    public void swim()
    {
        System.out.println("swim");
    }
    public void move()
    {
        System.out.println("move");
    } 
    public void fly()
    {
        System.out.println("fly");
    }
}
class Dog extends Animal implements Moveable, Swimmable
{
    public void swim()
    {
        System.out.println("swim");
    }
    public void move()
    {
        System.out.println("move");
    } 
}
class Cat extends Animal implements Moveable 
{
    public void move()
    {
        System.out.println("move");
    }
}

//todo abstact class and interfaces
abstract public class Animal 
{
    String name;
}
interface Moveable
{
    void move();
}
interface Flyable
{
    void fly();
}
interface Swimmable
{
    void swim();
}
