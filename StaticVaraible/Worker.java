package StaticVaraible;
import java.util.Scanner;
public class Worker
{
    int age;
    String name;
    private int salary;
    private static String company_name="Simurg";
    private static int pasword=1234;

    public Worker(int age, String name, int salary)
    {
        this.age=age;
        this.salary=salary;
        this.name=name;
    }
    public void get_info()
    {
        System.out.println(company_name+"  age = "+age+", salary = "+salary+", name = "+name);
    }
    public void set_CompanyName(String company_name)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("please enter the pasword ");
        int pasword=in.nextInt();
        if(pasword==Worker.pasword)
        {
            System.out.println("are you sure to change the name");
            String answer=in.next();
            if(answer=="yes")
                company_name=name;
            else
                System.out.println("process was stopped");
        }
        else
        {
            throw new IllegalArgumentException("the pasword is wrong"); 
        }    
    }
    public void set_salary(int salary)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("please enter the pasword ");
        int pasword=in.nextInt();
        if(pasword!=Worker.pasword)
            throw new IllegalArgumentException("wrong pasword");
        else
        {
            System.out.println("the new salary is "+salary);
            System.out.println("right 1");
            System.out.println("wrong 2");
            int control=in.nextInt();
            if(control==1)
                this.salary=salary;
        }
    }
}