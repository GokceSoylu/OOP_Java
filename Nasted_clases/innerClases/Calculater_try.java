//todo özet kimse kimsenin metodunada değişkenşnede ulaşamaz!🤷🏻‍♀️  
package Nasted_clases.innerClases;

public class Calculater_try 
{
    public static void  main(String[]Soylu)
    {
        Calculater calculater=new Calculater();//normal diş siniftan bir nesne oluştuk bakalım nelere ulaşabilecek.
        Calculater.Summation summation=new Calculater(). new Summation();//çok değişik değil mi?
                                                                        // ilk adım sınıfın kendisine dahi 
                                                                        //ulaşırken dış sınıf vasıtasıyla ulaşıyoruz tamamne dış sınıfa bağlı
                                                                        //içinde saklı direkt içtekine ulaşamayız!!
                                                                        //daha sonra bir dış sınıftan nesnemiz olmadığı için iç sinifin
                                                                        //kurucu fonksiyonunu kullanamıyoruz öce dış sınıfa bir nesne oluşturutoruz new ile
                                                                        //daha sonra yine new ile iç sinifimizin kurucu fonksiyonunu çalıştırıyoruz.
        Calculater.Substraction substraction=calculater. new Substraction(); //nasıl yine şoklardayız dimi
        System.out.println(summation.sum(1,2));
        System.out.println(substraction.sub(7,4));
        //! System.out.println(calculater.sub(12,3)); Dikkat olmuyor
        calculater.print();
        //! summation.print();
        //! substraction.print();
    }
}
//? hocam kabul ediyorum konu bir tık karışık hemen özetliyorum
//? iç içe sınıf oluşturduğumuzda sınıfın içerisindeyken iç sınıfın dıştakı ozelliklere metodlara ulaşabilir çünkü aynı sınıfın içindeyiz hala
//? aynı şekilde dış sınıf, sınıfın scobunun içrisindeyken iç sınıftan nesne oluşturup metod ve özellilere ulaşabilir(zaten sınıfın için neden sınıf oluşturuyoruz ulaşabilmeli zaten)
//? ancak sıfıfın içerisinde değiliz çıktık mainde dış sınıftan bir nesne oluşturduk işte o zaman bu nesne iç sınıftaki hiç bir metod ve özelliğe
//? ulaşamaz. mainde oluturulan iç sınıfın nesneside dış sınıfından hiç bir metoda ve özelliğe ulaşamaz. 
//? yani nasted class mantığı inheritance gibi değildir. sınıfın içerisindeyken birbirlerine ulaşabilirler ancak mainde nesne ile ulaşamazlar
//? çünkü birbirlerinin öezlliklerine sahip değillerdir.
