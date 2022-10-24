package StaticVaraible;

public class Worker_test 
{
    public static void  main(String[] Soylu)
    {
        Worker w1=new Worker(23,"hasan",12000), w2=new Worker(27,"firuze",24000);
        w1.get_info();
        w2.get_info();

        w1.set_salary(17000);
        w2.set_CompanyName("vestel");

        w1.get_info();
        w2.get_info();
    }  

}
