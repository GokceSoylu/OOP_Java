package Enum;
public class Enum3 
{
    enum Lectures
    {
        oop(5), data(5), logic(-2), circuit(-1), dif(0);//sınıf içerisinde değil direkt oluşturalim
        private int like;
        Lectures(int like)
        {
            this.like=like;
        }
    }    
    public static void main(String[] Soylu)
    {
        Lectures dis=Lectures.logic;
        Lectures like=Lectures.data;
        System.out.println(dis);
        System.out.printf("\nlike = %d",like.like);

    }
}
//AA enum kesinlikle c'deki gibi değil C'de sadece int değer atayabiliyorduk eğer ataamzsak kendisi birden başlayıp sırayla birir artırark
//değer atıyordu. Burada ise bildiğin sınıf gibi davranıyor.
//eveet sınıf GİBİ davranıyor ancak sınıf değil farkları nelerdir?
//her zaman public'tir, sabittir(const like final), extends edilemez(inheritance yapılamaz (kalıtım)) ve obje üretemez.
//ow ancak yukarıda yaptığımızda nedir? bildiğin gibi c++'da obje üretirken direkt varaible oluşturur gibi oluşturabilirdik. ancak Java'da
//durum farklı obje için her zaman new keyword'ünü kallanmalıyız. kullamadan oluşturduğumuz şey obje değil obje refaransı olur. bu uzun açıklamadan sonra 
//yukarıda enum'dan refarance bir nevi varaible oluşturduk obje değil. Enum obje oluşturamaz :))