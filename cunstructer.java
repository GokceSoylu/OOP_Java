public class cunstructer 
{
    public static void main(String[] Soylu)
    {
        Student s1=new Student();  
        Student s2=new Student("hasan",23,1);
        Student s3;// şimdi burada gördüğün gibi nestede götergeci oluşturduk ancak dah  boş
        //! s3.age=89;// bu yüzden burada hata alırız boşluğu gösteriyor bellketerki her hangi bir yeri göstermiyor.
        s3=new Student();// bellekten nesne iöçin yer aldık ve göstericiye atadık
        s3.age=89;//su an sorun yok :))
        System.out.println(s2.name);
 }
}
class Student
{
    int number, age;
    String name;

    Student()
    {
        System.out.println("paremetresiz kurucu calisti");
    }
    Student(String name, int age, int number)
    {
        System.out.println("parametreli kurucu calişti");
        this.name=name;
        this.age=age;
        this.number=number;
    }
    
}



/*  constructerlar ile ilgili:
    biz student s1; dediğimizde bir nesne belirteci oluşturuyoruz bunu bir nevi C'deki pointer gibi düşünebiliriz.
    s1=new Student(); dediğimizde ise Student() metodunun oluşturduğu nesne için bellekten bir yer alıyoruz ve bu yeri s1'e atıyoruz.
    devam ededlim hiç kurucu fonksiyon yazmasak default olarak kurucu fonksiyon bulunur ve direkt kullanabiliriz. bu default kurucu fonksiyon parametresizdir.
    sadece Student s=new Student(); diyerek oluşturabiliriz. kurucu fonksiyona işelm yaptırmak yada parametre verebilmek için kendimiz yazmalıyız.
*/