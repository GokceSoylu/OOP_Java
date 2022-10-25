package Try_catch;

public class Worker2_test 
{
    public static void main(String[] Soylu)
    {
        Worker2.get_counter();//hocam static methodu gördüğünüz gibi hiç nesne oluşturmadan da çağirabiliyotuz.
                                //çünkü nesneye bağlı değil :))
        Worker2 worker1=new Worker2("haasn sabbah",123);
        Worker2 worker2=new Worker2("tomris",12000);
        worker1.get_info();
        worker2.get_info();

        while(true)
        {
            try
            {
                worker1.set_salary();
                break;
            }
            catch(IllegalArgumentException e)
            {
                System.out.println(e.getMessage());
                System.out.println("please try to enter accaptable amount ");
            }
        }
        
        worker1.get_info();
        worker2.get_info();
        Worker2.get_counter();
    }
    
}
