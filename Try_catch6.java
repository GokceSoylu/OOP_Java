
import java.util.*;
public class Try_catch6 
{
    public static void main(String[] Soyulu)
    {
        Scanner in=new Scanner(System.in);
        try
        {
            int n=in.nextInt();
            if(n>100)
                throw new Exception("out of bond");
        }
        catch(InputMismatchException e)
        {
            System.out.println("not an integer ");
        }
        catch(Exception ee)
        {
            System.out.println("ERROR: "+ee.getMessage());/*  Buradaki mesaj bizim yukarıda yazdığımız. Exeption'u kendimiz oluşturduğumuz için
                                                              mesajda bizim yazdığımız oluyor. Şimdi bu kısma dikkat. normalde n>100 bunda v-bir hata var mı
                                                              program eror verir mi? Hayır. Ancak biz bu durumda hata vermesini catc'a gitmesini istiyoruz tamda bu yüzden
                                                              kendimiz orada Exception fırlatıyos (throw) :))*/
        } 
        finally
        {
            System.out.println("kurkcu dukkani ");
        }
        System.out.println("rest of code ... ");
        in.close();
    }
}
