package Week4_ex6;

public class Static2_ 
{
    private int id;
    private int salary;
    private String name;
    private static int counter=0;
    private static String company_name="Simurg";   

    Static2_(int id, String name, int salary)
    {
        this.name=name;
        this.id=id;
        this.salary=salary;
        counter++;
    }
    void print_info()
    {
        System.out.println(company_name+" "+id+" "+name+" "+salary);
    }
    int get_counter()
    {
        return counter;
    }
    void set(String name)
    {
        company_name=name;
    }
}
