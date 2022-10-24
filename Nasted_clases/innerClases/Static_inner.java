package Nasted_clases.innerClases;

public class Static_inner 
{
    int a;
    static int c;
    public void print()
    {
        System.out.println("dis sinif a= "+a);
    }
    public static void print2()
    {
        System.out.println("static yazdirma dis sinıi metodu");
    }
    static class Inner
    {
        int a;
        void print()
        {
            System.out.println("ic sinif a = "+a+" c = "+c);
            System.out.println();
            
        }
        public void print22()
        {
            print2();
        }
    }
}
//zaten iç içe sınıfın özelliklerini biliyoruz yazıldığı scab içerisinde geçerlidir sınıfın içinde bir sınıf yazmışsak dış sınıfın özellik ve 
//metdolarına dış sınıfın sınıf scobu içerisinde ulaşabilir yine dış sınıfta sanki private ozelliği buna sadece sınıf içeridsindeyken ulaşabilir
//karşılıklı olarak nesnelerinin birbirlerinin metod ve ozelliklerine ulaşma imkanı yoktur.(sınıf scobu dışındakş nesneler)
//static ise bize bir kural daha koyuyor sınıf içerisinde dahi olsa sadece static metdo ve özelliklere ulaşabiliyor.
//arı yönü ise dış sınıfa bağımlı olmadan kullanılıyor. static keyword'ün özelliiği bu değil miydi