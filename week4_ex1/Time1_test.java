package week4_ex1;
import java.util.*;
public class Time1_test 
{
    public static void main(String[] Soylu)
    {
        Scanner in=new Scanner(System.in);
        System.out.printf("%n sirasiyla saat, dakika saniye değerlerini giriniz");
        int h=0,m=0,s=0;
        try
        {
            h=in.nextInt(); 
            m=in.nextInt(); 
            s=in.nextInt();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        Time1 t1=new Time1(h,m,s);
        System.out.println(t1.toUniversalString()); 
        System.out.println();
        System.out.println(t1.toString());
        in.close();
    }    
}
