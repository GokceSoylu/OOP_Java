package StaticMethod2;

public class StaticMethod2 
{
    String name;
    int age;    
    static int year=2022;
    static void print_year()
    {
        System.out.println(year);//eğer ki year değeri static olmasaydı bu fonk bu varaible'a ulaşamazdı. Çümkü static metodla rsadece sttaic metodlara ve static değişkenlere ulaşabilir.
    }
}

