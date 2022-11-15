public class OverloadVsOverride 
{
    public static void main(String[] Soylu)
    {
        Human_ h1=new Human_("kelile", 89);
        Student_ s1=new Student_("Dimne",56,850);
        h1.growe();
        h1.growe(5);
        s1.growe();
        System.out.println(h1.age+" "+s1.schoolerShip);
    }
}
class Human_
{
    String name;
    int age;
    Human_(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    void growe()
    {
        age++;
    }
    void growe(int a)//! overload same methode name havin diffarent parameter list
    {
        age+=a;
    }
}
class Student_ extends Human_
{
    Student_(String name, int age, int schoolerShip) {
        super(name, age);
        this.schoolerShip=schoolerShip;
    }
    int schoolerShip;
    @Override
    void growe()//! override same method but in child class
    {
        schoolerShip+=age;
    }
}
