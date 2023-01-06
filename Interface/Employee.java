package Interface;

 
class Main
{
    public static void main(String[] Soylu)
    {
        FullTimeEmployee fe=new FullTimeEmployee("Hamdi", 10);
        System.out.println(fe.salary());
    }
}// ana sınıfta implement edip metodu yazdığımız için alt sınıflarsa tekrar yazmamıza gerek kalmadı :))
abstract public class Employee implements Salary
{
    String name;
    int wages;
    Employee(String name, int wages)
    {
        this.name=name;
        this.wages=wages;
    }
    public int salary()
    {
        return wages;
    }
}
interface Salary
{
    int salary();
}
class FullTimeEmployee extends Employee 
{
    FullTimeEmployee(String name, int wages)
    {
        super(name, wages);
    }
}
class PartTimeEmployee extends Employee 
{
    PartTimeEmployee(String name, int wages)
    {
        super(name, wages);
    }
}