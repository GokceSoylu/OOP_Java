package Compera;

import java.util.*;
//ez cümle comparable interfaceini dahil ettiğimizde bir nevi listeler üzerinde çalışan bir fonksiyonu overrid ediyoruz
//bahsetiğmiz sort fonksiyonu halihazırda var niz compareTo metodunun override ederek  nasıl sıralanması gerekitiğini söylüyoruz
public class Comparable_interface 
{
    public static void main(String[] Soylu)
    {
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student ("ahmed",100));
        list.add(new Student ("elif",90));
        list.add(new Student ("sercan",98));
        list.add(new Student ("kamil",89));
        System.out.println("before sorting");
        for(Student itr : list) System.out.println(itr);
        System.out.println("\nafter sorting");
        Collections.sort(list);
        for(Student itr : list) System.out.println(itr);
    }    
}
class Student implements Comparable<Student> //normalde object olarak nesne alır ama biz obje dünüşümle uğraşmak istemediğimiz için sadece student ile kıyaslanabilir yapıyoruz
                                            //kısace genereic ti ama biz tip belirttik
{
    String name;
    int grade;
    Student(String name, int grade)
    {
        this.name=name;
        this.grade=grade;
    }
    public boolean equals(Object o)
    {
        if(o==this) return true;
        if(o==null || this.getClass()!=o.getClass()) return false;
        return this.name==((Student)o).name && this.grade==((Student)o).grade;
    }
    public int compareTo(Student s)
    {
        return s.grade-grade;
    }
    public String toString()
    {
        return name+" "+grade;
    }
}
