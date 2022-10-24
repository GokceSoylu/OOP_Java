public class cunstructer 
{
    public static void main(String[] Soylu)
    { 
        cunstructer.Student s2=new cunstructer().new Student("hasan",23,1);
        cunstructer.Student  s3;// şimdi burada gördüğün gibi nestede götergeci oluşturduk ancak dah  boş
        //! s3.age=89;// bu yüzden burada hata alırız boşluğu gösteriyor bellketerki her hangi bir yeri göstermiyor.
        s3=new cunstructer(). new Student();// bellekten nesne iöçin yer aldık ve göstericiye atadık
        int a=s3.age;
        System.out.println(a);
        System.out.println(s2.name);
    }
    class Student
    {
        int number, age;
        String name;

        public Student()
        {
            System.out.println("paremetresiz kurucu calisti");
        }
        public Student(String name, int age, int number)
        {
            System.out.println("parametreli kurucu calisti");
            this.name=name;
            this.age=age;
            this.number=number;
        }
    } 
}

/*  constructerlar ile ilgili:
    biz student s1; dediğimizde bir nesne belirteci oluşturuyoruz bunu bir nevi C'deki pointer gibi düşünebiliriz.
    s1=new Student(); dediğimizde ise Student() metodunun oluşturduğu nesne için bellekten bir yer alıyoruz ve bu yeri s1'e atıyoruz.
    devam ededlim hiç kurucu fonksiyon yazmasak default olarak kurucu fonksiyon bulunur ve direkt kullanabiliriz. bu default kurucu fonksiyon parametresizdir.
    sadece Student s=new Student(); diyerek oluşturabiliriz. kurucu fonksiyona işelm yaptırmak yada parametre verebilmek için kendimiz yazmalıyız.
*/
//todo edit
//todo hocam bn sonradan baktım burada hata var. tek dosyaad birbirinden bağımsız iki sınıf yapmışıs b
//todo muhtemelrn bundan dolayı hata aldık. ikinci sınıfı ilkinin alt sınıfı yaptım bu yzüden nesne oluşturmada ufak değişiklikler yapamam gerkt i:))
 