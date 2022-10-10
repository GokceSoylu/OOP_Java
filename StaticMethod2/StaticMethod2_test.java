package StaticMethod2;

public class StaticMethod2_test 
{
    public static void main(String[] Soylu)
    {
        StaticMethod2 s1=new StaticMethod2();
        s1.name="Mihrimah";
        s1.age=37;
        
        System.out.println(s1.name+" "+s1.age+" "+StaticMethod2.year);
        
        StaticMethod2.print_year();
    }
}
//Static olmayan değişkenlere ulaşırken obje ile uşaşıyoruz. Ancak static değişkene obje olmadan direkt class name ile ulaşıyoruz.
//aynı durum metodlar içinde geçerli normal metodlara obje ile static metoda ise sadece class name ile ulaşırız.

//statiği anladık iyi hoşta bu main() metod neden  static? 
//obje olmadan çalıştırılsın diye. eğer static olmasaydı mainden once bir onje oluştumalı main'ide bu obje çağırmalıydı. Buda boşuna hafızaad yer kaplamak olurdu.

///hatırlıyor muyuz daha oop'ye başlamdan önce java da kod yazarken fonksiyonlar static olmalı emiştik. bunun nedini bu işte fonksiyonları objesiz çağırabilmek için
//ayrıca main satatic metod olduğu için sadece static metodları çağırabilir. :))  