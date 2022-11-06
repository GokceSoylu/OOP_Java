package ToString;
//hocam kurguyla çok uğraşmadım mantıksız gelebilir ancak this(), return this ve toString() 'i aynı örenkte tooplamak için yaptım :)) 
class Main
{
    public static void main(String[] Soylu)
    {
        Gamer g=new Gamer("Necmiye");
        Avatar avt=new Avatar(g.get_refarance());
        System.out.println(avt.get_gamer());
    }
}
public class Avatar 
{
    Gamer gamer;
    private int power;
    private int right;
    boolean live; 
    Avatar(Gamer gamer)
    {
        this();//bunu alta yazınca kabul etmiyor.
        this.gamer=gamer;
    }
    Avatar()
    {
        power=100;
        live=true;//hayatta demek
        right=5;//bei canla başlatıyoruz
    }
    public Gamer get_gamer()
    {
        return gamer;
    }
    
}
class Gamer
{
    private String name;
    Gamer(String name)
    {
        this.name=name;
    }
    public Gamer get_refarance()
    {
        return this;
    }
    public String toString()
    {
        return "  name  "+name;
    }
}
