package Try_catch8;
public class Worker 
{
    private int salary;
    private String name;
    private static int counter=0;
    
    public Worker(String name, int salary)
    {
        this.name=name;
        try
        {
            if(salary<0)
                throw new Exception("the salary cannot be lower thae zero"); 
            this.salary=salary;   
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            counter++;
        }
    }
    public Worker()
    {
        counter++;
    }
    public void setSalary(int salary)
    {
        try
        {
            if(salary<0)
            {
                throw new Exception("the salary cannot be lower than zero");
            }
            this.salary=salary;
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void print()
    {
        System.out.println(name+"  "+salary);
    }
    public static int getCounter()
    {
        return counter;
    }
}
