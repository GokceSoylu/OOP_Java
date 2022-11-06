package ToString;
//toString metodu string string döndürür bu her zaman boyle yapılır. biz normalde System.out.println(obje) desek bize bir şeyler 
//yazdıramaz. Ancak toString() netodumuz varsa direkt bumndan bahsettiğimizi anlar ve toString fonksiyonunu çalıştırr. 
//burayı anladıt-ysak şşimdi biraz daha konuyu derinleştirelim aslında halıhazırda var olan toString() metodu var direkt objeyi
//yazdırmaya çalıştığımızda harta almayız. Gördüğümüz çıktıda va rolan metodda dolayı obje adını refarans değerini falna yazdırır
//biz bir toString metodu tanımladığımızda aslında bu var lan metodu override etmiş oluyoruz. bu sayede adı ile yazdırmaya çalıştığımızda dierk metodu biliyor 
public class first 
{
    public static void main(String[] Soylu)
    {
        Student s=new Student("hasan",45);
        System.out.println(s);//işte bir nevi get_info() metodunun kolylaştırılmış hali.
        System.out.println(s.toString());//gördüğmüz gibi iki kullanım arasında bir fark yok
    }
}
class Student
{
    private String name;
    private int age;
    Student(String name, int age)
    {
        this.name=name;
        this.age=age;
    } 
    public String toString()
    {
        return "name = "+name+"   age = "+age;
    }
}
