package Abstract;

abstract public  class Animal 
{
    abstract void eating();
    void deneme()
    {
        System.out.println("abstract olmayan sinif");
    }    
}
class Cat extends Animal
{
    void eating()
    {
        System.out.println("the cat is eating");
    }
    void meow()
    {
        System.out.println("meow");
    }
}
class Dog extends Animal
{
    void eating()
    {
        System.out.println("the dog is eating");
    }
    void barking()
    {
        System.out.println("wow");
    }
}
