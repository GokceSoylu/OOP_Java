package Try_catch3;
import java.util.*;
public class Try_catch7 
{
    public static void main(String[] Soylu) 
    {
        Scanner in=new Scanner(System.in);
        int n=0;
        try
        {
            System.out.println("please enter a string");
            n=in.nextInt();
        }
        catch(InputMismatchException Exception)
        {
            System.out.println (Exception.getMessage());
        }
        finally
        {
            System.out.println("her turlu calisan finally kismi");
        }
        System.out.println(n);
        in.close();
    }   
}
//ornegin devamı Try_catch8.java dosyasında