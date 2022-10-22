package Nasted_clases.innerClases;

public class Calculater_try 
{
    public static void  main(String[]Soylu)
    {
        Calculater calculater=new Calculater();//normal diş siniftan bir nesne oluştuk bakalım nelere ulaşabilecek.
        Calculater.Summation summation=new Calculater(). new Summation();//çok değişik değil mi?
                                                                        // ilk adım sınıfın kendisine dahi 
                                                                        //ulaşırken dış sınıf vasıtasıyla ulaşıyoruz tamamne dış sınıd*fa bağlı
                                                                        //içinde saklı direkt içtekine ulaşamayız!!
                                                                        //daha sonra daha bir dış sınıftan nesnemiz olmadığı iççin iç sinifin kurucu
                                                                        //kurucu fonksiyonunu kullanamıyoruz öce dış sınıa bir nesne oluşturutorux-z new ile
                                                                        //daha sonra yine new ile iç sinifimizin kurucu fonksiyonunu çalıştırıyoruz.
        Calculater.Substraction substraction=calculater. new Substraction(); //nasıl yine şoklardayız dimi
        System.out.println(summation.sum(1,2));
        System.out.println(substraction.sub(7,4));
        //! System.out.println(calculater.sub(12,3)); Dikkat olmuyor
        calculater.print();
        //! summation.print();
        //! substraction.print();
    }
}//yanı inheritance gibi dışa ulaşma yok. e dıştaki de içe ulaşamıyor sadece bağımlılık getirdi başka ise yaramadı
//yani bir diş sınıf nesnes,i var olmadan var olaamıyor bunu anladık varlığı başk anesneinin varlığına mecbur bu kadar 
//başka avantajı yok.
//inner class private olsa
