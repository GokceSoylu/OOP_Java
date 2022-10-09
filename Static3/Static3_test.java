package Static3;

public class Static3_test 
{
    public static void main(String[] Soylu)
    {
        Static3_ s1=new Static3_("hasan",7);
        Static3_ s2=new Static3_("Davud",1);

        System.out.println(s1.get_counter());
        System.out.println(s2.get_counter());
        s1.get_info();
        s2.get_info();

        Static3_.set_year(2000);
        s1.reset_counter();
        
        s1.get_info();
        s2.get_info();
        System.out.println(s1.get_counter());
        System.out.println(s2.get_counter());
    }   
}
/*
 * görüldüğü üzere static değer sonradan fonksiyonlarlada değiştirilebiliyor. bumu const gibi düşünmeyelim yaşayan değiştirilebilen 
 * bir şeydir static sadece hafızada tek bir yerde dururu bu yüzden değişikliğinden tüm objeler etkilenir. Çünkü o birtane :
 */
