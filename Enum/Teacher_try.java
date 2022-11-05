package Enum;

public class Teacher_try
{
    public static void main(String[] Soylu)
    {
        Branch hasan_b=Branch.physics, asli_b=Branch.computer;
        Teacher hasan=new Teacher(1,hasan_b), asli=new Teacher(2, asli_b);
        System.out.println("hasan");
        hasan.get_info();
        System.out.println();
        System.out.println("asli");
        asli.get_info();
    }
}