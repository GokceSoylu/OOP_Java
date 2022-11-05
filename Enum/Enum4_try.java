package Enum;

public class Enum4_try 
{
    public static void main(String[]Soylu)
    {
        Enum4 n=Enum4.ns, s=Enum4.ss;
        System.out.printf("birthday = %d/%d/%d%n",n.day,n.month,n.year);
        //System.out.printf("eye colour  %s",n.eye_colour);//eye_colour değişkenini private yaptığımız için ulaşamıyoruz
        s.set_day(14);
        System.out.println(s.day);
    }    
}
//dikkat edelim yeni obje oluşturmadık. var olan objeyi atadık