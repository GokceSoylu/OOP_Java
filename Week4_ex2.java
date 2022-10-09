

public class Week4_ex2 
{
    public void m()
    {
        int data=50/0;
    }    
    public void n()
    {
        m();
    }
    public void p()
    {
        try
        {
            n();
        }
        catch(Exception e)
        {
            System.out.println("Exception Handled");
        }
    }
    public static void main(String[] Soylu)
    {
        Week4_ex2 obj=new Week4_ex2();
        obj.p();
        System.out.println("normal flow ");
    }
}
// aetn dikkat etmişizdir. p n'yi çağırıyor n m'yi çağırıyor m'de ise hata veriyor evet diğer fonklara gitti ama  yinede try
//bloğu içinde olduğu için hatayı yakaladı yanı bir fonku biz try'ın içine koyduğumuz zaman fonkun içindeki tüm kodlardaki hatalar yakalanır
// ne kadar uzun olursa olsun :)) vay be güzelmiş.