package Creat_obje;

public class inMethodParanthes 
{
    Human h1=new Human("e");
    Human h2=new Human("w");
    Human h3 = new Human("s");
    Human[]h=new Human[3];//Human(h1,h2,h3);
    Sinif(new Human("t"));

}
class Human
{
    String name;
    Human(String name)
    {
        this.name=name;
    }
}
class Sinif
{
    Human human;
    Sinif(Human human)
    {
        this.human=human;
    }
}