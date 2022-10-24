package StaticVaraible;

//initliazing for static varaibles
public class StaticVaraible5_test 
{
    public static void main(String[] Soylu)
    {
        StaticVaraible5.e=30;// eveeet görüldüğü üzere class'ta tanımladığımız bir değişkeni main'de dahi initialize edebiliriz ancak obje 
        //ile değil direkt sinif ismi ile ulaştığımıza dikkat
    }
        
}
//ez cümle static olması gözünü korkutmaı-sın bu 'final' keyword değil ki sadedece constructer function, tanımlandığı yer, static scope ve 
//normal scope gibi dört yöntemle initialize edilebilsin. isteğiniz her türli şekilde initiaize edbilirsin. arada 'final' keyword özeti:))
//ciddi anlamda 'final' keyword'den sonra static biraz karıştı ama static 'final' keyword gibi sadece belirli yöntemlerle initialize edilmez. isteğin sekilde 
//initialize edebilirsin sadece obje kullanmadan sınıf ismyle erişeceğini unutma yeter :)) 