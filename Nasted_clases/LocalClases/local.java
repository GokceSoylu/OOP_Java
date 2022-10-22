package Nasted_clases.LocalClases;
//şimdi local class'da bir nasted class(iç içe sinif) örneğidir. Local class bir metodun içerisine yazılır. sadece bu tarafından ulaşaıllabilir
//olur Başka hiç bir yerden hiç bir şeklde erişilemez. bu yüzden başına public static gibi ifadeler yazılmaz. 
public class local 
{
    public static void main(String[] Soylu)
    {
        class Hi
        {
            private int t=10;
            void print()
            {
                System.out.println(t);
            }
            public void english()
            {
                System.out.println("Hello");
            }
            public void turkish()
            {
                System.out.println("Merhaba :))");
            }
            private void spanish()
            {
                System.out.println("Hola");
            }
        }
        Hi hi=new Hi();
        hi.print();
        hi.t=20;
        hi.print();
        hi.english();;
        hi.turkish();
        hi.spanish();//eveet local sınıfın içindeki private metoda ulaşabildik.  
    }
}
//todo yani görüldüğü gibi local sınıfın içindeki private metodlarada özelliklerede rahtlıkla ulaşabiliyoruz. Zaten aynı metodun içindeyiz
//todo ama dışarıdan öldür ulaşılamaz
//todo hoacm birde bu oluşan nesne metod çalışken oluşturulur sonra yok olur.

//mainde ve farklı classlarda metodlarda deneyelim.
