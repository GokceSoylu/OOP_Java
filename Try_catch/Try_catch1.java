package Try_catch;//try_catch2.java dosyasında dah güzel anlatım var
import java.util.*;
public class Try_catch1 
{
    public static void main(String[] Soylu)
    {
        int a;
       
        System.out.println("please enter an integer value");
        while(true)
        {
            try
            {
                Scanner i=new Scanner(System.in);//neden demeyiniz bende bilmiyorum. eğer bu scanner new kısmını burada yazmassak sonsoz döngüye giriyor.
                a=i.nextInt();
                break;
            }
            catch(InputMismatchException e)
            {
                System.out.println("you must enter integer value");
                System.out.println("enter a new value please");
            }
        }
        System.out.println("the value is "+a);
    }
}
