package Nasted_clases.innerClases;

public class Static_innerTest 
{
    public static void main(String[] Soylu)
    {
        Static_inner s1=new Static_inner();
        Static_inner.Inner i1=new Static_inner.Inner();//işte burası normalde iki new falan kullanıyorduk yani obje olmadan kurucu fonksiyonu çalıştırıyamıyorduk
        s1.a=10;                                        //static iç sinif olduğu için direkt sınıfın adı. diyerek kurucuyu çağırdık.
        i1.a=20;
        s1.c=30;
        s1.print();
        i1.print();
        i1.print22();
    }    
}
