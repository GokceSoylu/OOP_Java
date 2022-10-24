package StaticVaraible;
//stattiiği hiç iitialize etnmsen iste counter olaark kullanalım falan. fonklar içinde değiştirebiliyor muyuz? birde interneteen bakalaım
public class Static3_ 
{
    private int age;
    private String name;
    private static int year=2022;
    private static int counter=0;

    Static3_(String name, int age)
    {
        this.name=name;
        this.age=age;
        counter++;
    }

    static void set_year(int y)
    {
        year=y;
    }
    void reset_counter()
    {
        counter=0;
    }
    int get_counter()
    {
        return counter;
    }
    void get_info()
    {
        System.out.println(name+" "+age+" "+year);
    }
}
