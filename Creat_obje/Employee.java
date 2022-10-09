package Creat_obje;

public class Employee 
{
    int socialSecurityNumber, workingHours;
    Float wage;
    String name;

    void displayInfo()
    {
        System.out.println("Social Security Number "+socialSecurityNumber+"   name "+name);
    }
    void printSalary()
    {
        System.out.println("slary is "+(wage*workingHours));
    }
}
