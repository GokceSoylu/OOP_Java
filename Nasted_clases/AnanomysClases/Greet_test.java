package Nasted_clases.AnanomysClases;

public class Greet_test 
{
    public static void main(String[] Soylu)
    {
        Greet greet1=new Greet();
        Greet greet2=new Greet()
        {
            public static int a=1;
            public void counter()
            {
               for(int i=0;i<a;i++)
                    counter--;
            }
            public void say(int a)
            {
                System.out.println("hi");
            }
        };
        greet1.say(5);
        greet1.counter();
        greet1.get_counter();
        System.out.println("--");
        greet2.say(5);
        //System.out.println("a = "+greet2.a);
        greet2.counter();
        greet2.get_counter();
       //greet2.decrease();


    }    
}
//anonim classta oluşturduğumuz class içinde yeni ozellik metod oluşturamauız ya aslında oluştururruz ama scab iinde oluşturulup silinir bu y
//dışarıda kullanamayız. Hmm ne yapılabilir mesala bir metod oluşturup işte omu kulllanıp sonra sonucu zaten class ın içinde olan bir değişkene atarsın fln
//kısaca override etmene izin verir. ama overload da dahil olmak üzere yeni metod özellikleri scob dışında kullanmana izin vermez :))
//? ez cümle overload dahi edemezsin sadece override edbilirsin
