package Try_catch;
/* 
public class try_catch 
{
    public static void main(String[] Soylu)
    {
        int number=10, number2=0;
        System.out.println("start");
        System.out.println(number/number2);
        System.out.println("end");
    }    
}
*/
public class Try_catch 
{
    public static void main(String[] Soylu)
    {
        int number=10, number2=0;
        System.out.println("START");
        try
        {
            System.out.println(number/number2);
            System.out.println("inside of try after the error");
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("END");
    }    
}
//? Ne oluyor burada
//? Kuzu try kısmına yazdığımız yerde hata bulduğu zaman catch kısmını konntrol ediyor eğer catch kısmında biz bu hatdan bahsetmişsek
//? uygun catch bloğunun içine giriyor ve kodu çalıştırıyor bu da bittikten sonra artık try bloğuna da diğer catchlere de devam etmiyor
//? alta geçip oradaki kodlardan devam ediyor. Eğer try catch olmasaydı hatadan sonra devam etmez programı derlemeyi bırakırdı.
//? pekii ya try kısmını içind ebulunan hatayı cath'e yazmamışask orada bulamazsa işte o zmn hoppala ne namladım bn ne anladım bu isten
//? der ve hatayı verip derlemeyi bırakır çünkü catch kısımını kullanamyınca try 'da hatayı buklsa ne olacak yapacak ek bir şey yok.
//? işte normalde ne olur hata bukunur hatayı ekrana basar ve derlemeyi bırakır. Java ise bize bir şans daha veriyor try bloğunun içine yazdığın
//? kısımda hata bulursam bu hata için olan catch'teki kodu çalıştırır try'dan çıkıp !koda devamm ederim! diyor :)) 