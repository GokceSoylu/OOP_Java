package Compering;
import java.util.*;
//buradan ise sort metodunun kullanacaği sıralama şekilin comparTo ile belirtmek yerine
//sort fanckisyonunnun yanşnda bir obje olarajk gönderiyoruz.
//buda farklı sıralama şekillrini kullanabilmemizi sağlıyor
public class Coparator_interface 
{
    public static void main(String [] Soylu)
    {
        Engineer e1=new Engineer("Necmiye", 10000, 30);
        Engineer e2=new Engineer("Kelile", 1000, 33);
        Engineer e3=new Engineer("Dimne", 100, 22);
        Engineer e4=new Engineer("Ferhat", 1009,45);
        Engineer e5=new Engineer("Kenan", 10099,32);
        CompareName cn=new CompareName();
        ComparaAge ag=new ComparaAge();
        CompareSalary cs=new CompareSalary();
        ArrayList<Engineer> list=new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        Collections.sort(list,cn);
        System.out.println("\nsorting by name");
        for(Engineer e:list)
            System.out.println(e);
        Collections.sort(list,ag);
        System.out.println("\nsorting by age");
        for(Engineer e:list)
            System.out.println(e);
        Collections.sort(list, cs);
        System.out.println("\nsorting by saalry :))");
        for(Engineer e:list)
            System.out.println(e);
    } 
}
class Engineer 
{
    String name;
    int salary;
    int age;
    Engineer(String name, int salary, int age)
    {
        this.age=age;
        this.name=name;
        this.salary=salary;
    }
    public String toString()
    {
        return name+" "+age+"  "+salary;
    }
}
class ComparaAge implements Comparator<Engineer>
{
    public int compare(Engineer e1, Engineer e2)
    {
        return e1.age-e2.age;
    }
}
class CompareName implements Comparator<Engineer>
{
    public int compare(Engineer e1, Engineer e2)
    {
        return e1.name.compareTo(e2.name); //! Dikkat edelim compareTo override etmesekte hali hazırda var ve alfabetik sıraya göre sıralar :))
    }
}
class CompareSalary implements Comparator<Engineer> //en önemlisi :))
{
    public int compare(Engineer e1,Engineer e2)//todo tüm sıralamalar küçükten büyüğe iken burada büyükten küçüğe sıraladık
    {
        return e2.salary-e1.salary;
    }
}