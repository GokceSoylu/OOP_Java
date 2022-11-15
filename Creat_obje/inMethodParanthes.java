package Creat_obje;

public class inMethodParanthes 
{
    public static void main(String[] Soylu)
    {
        Human h1=new Human("e");
        Human h2=new Human("w");
        Human h3 = new Human("s");
        Human[]h=new Human[]{h1,h2,h3,new Human("q")};//! Önemli
        Sinif s=new Sinif(h);
        s.printStd();   
    }
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
    Human[] students;
    Sinif(Human[] human)
    {
        students=human;
    }
    void printStd()
    {
        int i=1;
        for(Human h:students)
            System.out.println((i++) +" "+h.name);
    }
}