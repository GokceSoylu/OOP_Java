package StaticVaraible;
import java.util.Scanner;
public class Worker
{
    int age;
    String name;
    private int salary;
    private static String company_name="Simurg";
    private static int pasword_company=1234;
    private int pasword_own;

    public Worker(int age, String name, int salary)
    {
        this.age=age;
        this.salary=salary;
        this.name=name;
        set_pasword();
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
        if(pasword==Worker.pasword_company)
        {
            System.out.println("are you sure to change the name yes 1, no 2");
            int answer=in.nextInt();
            if(answer==1)
                Worker.company_name=company_name;
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
        if(pasword!=this.pasword_own)
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
    private void set_pasword()
    {
        System.out.println("please enter your own pasword ");
        Scanner in=new Scanner(System.in);
        pasword_own=in.nextInt();
    }
}