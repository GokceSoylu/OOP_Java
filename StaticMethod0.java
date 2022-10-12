public class StaticMethod0 
{
    public static void main(String[] Soylu)
    {
        StaticMethod0 m=new StaticMethod0();
        m.print();//objesiz çağırılamadı
        
        print_s();//direkt çağırdık :))
    }
    static void print_s()
    {
        System.out.println("hello from static :))");
    }
    void print()
    {
        System.out.println("hello from non-static");
    }
}
//Static varible'in ne olduğunu biliyoruz.
//her obje bellekte yaşayan ayrı hücreler gibiydi bizde her biri için aynı olan vb durunlar için
//bellekte tek bir yer kaplayacak tek bir olan tüm objelerin kullanacaği bir varaible yapalım dedeik. Bize bunu sağlayan static keyword oluyor
//varaible durum buydu metodda da aynı mantık var. her obje için ayrı ayrı olmayan tüm objelerin kullancağı, nesne olmadan çağırılabilecek metodlar
//oluşturmak isteğimizde static keyword'ü kullanıyoruz. 

//static metodun sadece static varibles'a ulaşabildiğni unutmayalım ornek-> StaticMethod2.java