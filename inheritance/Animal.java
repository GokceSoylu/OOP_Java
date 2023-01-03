package inheritance;

public class Animal 
{
    void eat()
    {
        System.out.println("animal is eating..");
    }
}
class Cat extends Animal
{
    void eat()
    {
        System.out.println("cat is eating");
    }
    void meow()
    {
        System.out.println("meow");
    }
} 
class Dog extends Animal
{
    void eat()
    {
        System.out.println("the dod is eating");
    }
    void barking()
    {
        System.out.println("wow");
    }
}
class Horse extends Animal
{
    void voiceH()
    {
        System.out.println("the voice...");
    }
}