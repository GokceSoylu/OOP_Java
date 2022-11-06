package Final;

public class FinalVaraible
{
    final int x=10;
    final int y;
    final int a;
    static final int z;
    static final int t=80;
    FinalVaraible()
    {
        y=20;
    }
    static
    {
        z=30;
    }
    {
        a=90;
    }
}
//final sözünden kasıt C'de bildiiğimiz const(en azındsan final varaible için kast ettiğimiz bu).
//bir kez initialize edilir ve daha değiştirilmez.
//initialize metodları
//* ilk tanımlandığı yerde
//* kurucu fonksiyonun içinde --> ancak başka fonk olmaz
//* bir scobun içinde
//* static scobun içinde

//Dikkat edelim final varaible initialize edilmek zorundaddır. yukarıdaki gibi tanımlayıp altta bir scobun içinde değer vercekesek srun
//yok ama onun dışında final varaible initialize edilmek zorundadır. bir daha değiştirilemediğine ilk değer atanmalıdır:)) 