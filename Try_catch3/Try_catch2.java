package Try_catch3;
public class Try_catch2 
{
    public static void main(String [] Soylu)
    {
        int a[]=new int[10], b, c;
        try
        {
            b=a[13];
            c=9/0;
        }
        catch(IndexOutOfBoundsException e) //bu kısımda hatanın adını yazıyoruz nereden buldum? try 'sız çalıştırdım terminalde verdiği
        {                                     //hatayı copy-paste yaptım:)) 
            System.out.println(e.getMessage());
            b=a[0];
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
            c=9/2;
        }
        catch(Exception e)//bu kısım ise yukarıdakıler olmazsa diye genel bir exception hiçbiri mi olmadı olsun gel buraya.
        {
            System.out.println(e.getMessage());
            System.out.println("general catch part ");
        }
        finally             
        {
            System.out.println("we loved try-catch :))");
        }// bu kısımsa mutlak çalıştır demektir. try'da hata olsa da olmasa da. catch'de yakalansa da yakalanmaasa da çalışitır demek :))
    }       
}
/* 
todo            output: 
todo            Index 13 out of bounds for length 10
todo            we loved try-catch :))
görüldüğü gibi ilk hatada hemen catch bloğu aranıyor ve ona göre hareket ediliyor Yani bir try bloğu içinde bir tane hata yakalayabiliriz.
o zaman her hata ihtimaline ayrı try'lar açabiliriz. Bunun yanı sıra madem bir tane hata yakalama hakkı var o zaman neden birden fazla catch yazıyoruz
çünkü hatanın ne olduğunu bilmiyoruz bu hataysa boyle yap bu hataysa boyle yap diye belirtiyoruz:)) 
hop🙋🏻‍♀️ peki genel exception neden var? hatyı tahmin ettiklerimiz arasından çıkmıyor ama program bitmesin yakalayalım diye belki getMessage() ile
hatayı yazdırıp öğrenebiliriz. yada kodun durumuna göre başka şeyler yazılır:))

--> hop bir ek bilgi daha  catch kısımlarına bakarsan IndexOutOfBoundsException ArithmeticException her biri birer exception bunların arasında
bir inheritance var exceptiontion dediğimiz ise en alttaki yani hepsini kapsan oluyor :))
*/