package Try_catch3;

public class Worker_test 
{
    public static void main(String[] Soylu)
    {
        Worker w1=new Worker("necmiye",10000);
        Worker w2=new Worker("sabriye",10000);
        Worker w3=new Worker("hasan",1000);

        w1.print();
        w2.print();
        w3.print();

        Worker w4=new Worker();
        w4.setName("salim");
        w4.setSalary(-200);
        w4.print();

        Worker w5=new Worker("muaz",-90);
        w5.print();

        System.out.println(Worker.getCounter());
    }    
}
