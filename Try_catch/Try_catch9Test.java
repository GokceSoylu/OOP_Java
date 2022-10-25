package Try_catch;

public class Try_catch9Test 
{
    public static void main(String[] Soylu )    
    {
        Try_catch9 a=new Try_catch9();
        a.n1=10;
        a.n2=0;
        System.out.println(a.devide()); 
    }
}
//? dındın yazdığımız mesajı değil normal bulduğu exception'un mesajını verdi
//? yani bizim throw'ladığımız değil kendi bulduğu exceptionu kullandı. Ama neden?  
//? şimdi throw atıp kullanmamız için bizim bi if else iihtiyacımız var. yukaruya baktuğımızda 
//? (yukarıdan kastın devide() fonksiyonun olduğu dosya) result=n1/n2; dediiğimiz zaman 
//? throw kısmına geçmeden zaten Exception (hata) olacağı için hiç throw'u görmdeden catch'e gider.
//? peki madem throw'a ulaşılamıyor o zaman once throw satırını yazalım. O zaman exception fırlattığımız 
//? ondan sonraki satıra geçmez yanı resuşt=n1/n2; satırının hiç göremmez. zaten boyle bir yazıma 
//? derleyicide izin vermez. 
//? Unutmayalım ortada zaten bir hata varse onu sadece yakalmaya çalılşırız. Throwu var olmayan bir hatada kullanırız
//? derleyeicinin hata vermeeyceği bir şeyde biz hata almak exception fırlatırız :))