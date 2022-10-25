package Try_catch;
import java.util.*;
public class Worker2 
{
    private static int counter=0;
    private String name;
    private int salary;

    Worker2(String name, int salary)
    {
        this.name=name;
        this.salary=salary;
        counter++;
    }
    public void set_salary()
    {
        Scanner in=new Scanner(System.in);
        int salary=in.nextInt();
        if(salary<0)
            throw new IllegalArgumentException("the salary amount cannot be less then zero");
        else
            this.salary=salary;
    }
    public void set_name(String name)
    {
        this.name=name;
    }
    public static void get_counter()
    {
        System.out.println("total worker  = "+counter);
    }
    public void get_info()
    {
        System.out.println("name "+name+", salalry "+salary);
    }
}
