package Abstract;

abstract public class Employee 
{
    String name_surname;
    int ssn;
    public Employee(String name_surname, int ssn)
    {
        setName_surname(name_surname);
        setSsn(ssn);   
    }
    public void setName_surname(String name_surname)
    {
        this.name_surname=name_surname;
    }
    public void setSsn(int ssn)
    {
        this.ssn=ssn;
    }
    abstract public double earning();
    public String toString()
    {
        return name_surname+" "+ssn;
    }
}
class HourlyEmployee extends Employee
{
    double wages;
    int hours;
    HourlyEmployee(String name_surname, int ssn, int hours, double wages)
    {
        super(name_surname, ssn);
        this.hours=hours;
        this.wages=wages;
    }
    public double earning()//! Dikkat edelim herşeyi aynı olmalı publicse public yazmalısın
    {
        if(hours<=40)
            return wages*hours;
        else 
            return wages*hours+(hours-40)*wages*1.5;
    }
    public String toString()
    {
        return super.toString()+" wgae = "+wages+" hours "+hours;
    }
}
class SalariedEmployee extends Employee
{
    double weeklySalary;
    SalariedEmployee(String name_surname, int ssn, double weeklySalary)
    {
        super(name_surname, ssn);
        this.weeklySalary=weeklySalary;
    }
    public double earning()
    {
        return weeklySalary;
    }
}
class ComissionEmployee extends Employee
{
    double grossSale, comissionRate;
    ComissionEmployee(String name_surname, int ssn, double grossSale, double comissionRate)
    {
        super(name_surname, ssn);
        this.comissionRate=comissionRate;
        this.grossSale=grossSale;
    }
    public double earning()
    {
        return comissionRate*grossSale;
    }
    public String toString()
    {
        return super.toString()+" gross sale "+grossSale+" comission rate "+comissionRate;
    }
}
class BasePlusComissionEmployee extends ComissionEmployee
{
    double baseSalary;
    BasePlusComissionEmployee(String name_surname, int ssn, double grossSale ,double comissionRate, double baseSalary)
    {
        super(name_surname, ssn, grossSale, comissionRate);
        this.baseSalary=baseSalary;
    }
    public double earning()
    {
        return super.earning()+baseSalary;
    }
}