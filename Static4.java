public class Static4 
{
    int n;
    static int m;

    public int get_n()
    {
        return n;
    }
    public static int get_n_s()
    {
        // return n; //! bu olmadı dikkat edelim çünkü sattic fonk sadece static varaible'a ulaşabilir.
        return 0;
    }
    
    public int get_m()
    {
        return m;
    }
    public static int get_m_s()
    {
        return m;
    }
}
//Static fonksiyon sadece static değişkene ulaşabilir. non-satatic fonksiyon hepsine (hem static hem non-static değişkene) ulaşabillir
