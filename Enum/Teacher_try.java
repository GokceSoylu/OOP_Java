package Enum;

public class Teacher_try
{
    public static void main(String[] Soylu)
    {
        Branch hasan_b=Branch.physics, asli_b=Branch.computer, m=Branch.math, e=Branch.eng;
        Teacher hasan=new Teacher(1,hasan_b), asli=new Teacher(2, asli_b);
        System.out.println("hasan");
        hasan.get_info();
        System.out.println();
        System.out.println("asli");
        asli.get_info();
        System.out.println();
        
        Teacher[] t={new Teacher(101,m), new Teacher(102, e), new Teacher(103, asli_b)}; //hocam bunun bir tık değişik geldiğinin farkındayım 
        for(Teacher each:t)                                                                        //Creat_obje dosyasında Object_array.java dosyası var. ona bir göz atabiliriz
            each.get_info();                                                                       //array obje oluşturma ve initialize etme ile ilgili çeşitli yöntemler var.
        
        Teacher[] t2=new Teacher[2];
        t2[0]=hasan;
        t2[1]=asli;
        System.out.println();
        for(Teacher each:t2)
            each.get_info();
    }
}