package Nasted_clases.innerClases;

public class Static_inner 
{
    int a;
    static int c;
    public void print()
    {
        System.out.println("dis sinif a= "+a);
    }
    static class Inner
    {
        int a;
        void print()
        {
            System.out.println("ic sinif a = "+a+" c = "+c);
        }
    }
}
//bir sınıf düşünelim içine static bir iç sınıf yapıcaz
//sttaic olunca bu tek defa üretilecek ilginç değil mi
//inner olmayan static sınıf var mıdır racaba? -->yoktur
//static class nonstatic dis sinif ozelliğine ulaşamıyor ama static olan diş sınıf üzelliiğine ulaşabilir mi?;
//static inner class ın özelliği dış sınıfa bağımlı olmadan ulaşılabilmesi