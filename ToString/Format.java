package ToString;
//String.format() metodunu denemek istedik :)
public class Format 
{
    public static void main(String[] Soylu)
    {
        int a=10, b=20, c=30;
        int[] array={a,b,c};
        String s1=String.format("a = %d%nb = %d%nc = %d",a,b,c);
        System.out.println(s1);
        
        Deneme d=new Deneme();
        System.out.println(d.method(array));
    }
}
class Deneme
{
    
    public String method(int[] array)
    {
        //return String.format("%n%narray[0] = %d%narray[2] = %d%narray[2] = %d",array[0], array[1], array[2]);
        return String.format("str");
    }
    //todo override edeyim dedim ama olmadı çünkü dikkat edersen String.format() diyoruz. yani direkt spesifik olara Sting sınıfındaki çapiriyoruz
    //todo hmm ama String.format() değilde format() desek o zaman bizimkini çağirir.
    /* 
    public String format(String str)
    {
        return "hop";
    }
    */
}
//işte formatli yanı printf tipi string yazmamızı sağlar. bu metodun içine yazdığımız formatlı stirngi döndürür.