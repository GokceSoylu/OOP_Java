package StaticMethod;
public class StaticMethod1 
{
    static void print()
    {
        System.out.println("The static method was run");
    }    
    public static void main(String[] Soylu)
    {
        print();
    }
}
//Static method'un en önemli ozelliği obje olmadan çağırılabiliyor olması.
//static method sadece static değerleri ve static metodları çağirabilir.
//static metod super ve this keyword'lerini kullanamaz.