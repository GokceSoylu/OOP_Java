package Nasted_clases.LocalClases;

public class Student_test 
{
    public static void main(String[] Soylu)
    {
        Student s1=new Student("hasan","engineering",1);
        Student s2=new Student("cem","education",4);
        Student s3=new Student("kemal","medical",7);
        s1.print_info();
        s2.print_info();
        s3.print_info();

        s1.year=2033;
        s1.print_info();
        System.out.println(s1.year+" "+s2.year);
    }    
}