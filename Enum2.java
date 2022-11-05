public class Enum2 
{
    enum Colour
    {
        red, green, orange, blue
    };
    public static void main(String[] Soylu)
    {
        Colour c=Colour.green;
        //String b=Colour.blue; type uyumsuz :))
        System.out.printf("\nc = %s",c);
        for(Colour m:Colour.values())       //todo yine burada da birbirini takip eden sıralı değerler olduğu için foreach kullanabiliyoruz :)
            System.out.printf("\n%s",m);
    }    
}
