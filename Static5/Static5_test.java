package Static5;
//initliazing for static varaibles
public class Static5_test 
{
    public static void main(String[] Soylu)
    {
        Static5.e=30;// eveeet görüldüğü üzere class'ta tanımladığımız bir değişkeni main'de dahi initialize edebiliriz ancak obje 
        //ile değil direkt sinif ismi ile ulaştıpımıza dikkat
    }
        
}
//ez cümle static olması gözünü korkutmaı-sın bu final değil ki sadedece constructer function, tanımlandığı yer, static scope ve 
//normal scope gibi dört yöntemle initialize edilebilsin. isteğiniz her türli şekilde initiaize edbilirsin. ararda final özeti:))
//ciddi anlamda final'dan static biraz karıştı ama static final gibi sadece belirli yöntemlerle initialize edilmez. isteğin sekilde 
//initialize edebilirsin sadece obje kullanmadan sınıd-f ismyle eerişeceğini unutma yeter :)) 