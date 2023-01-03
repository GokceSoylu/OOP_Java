package Abstract;

public class MainAnimal 
{
    public static void main(String[] Soylu)
    {
        Cat c=new Cat();
        Dog d=new Dog();

        c.eating();
        d.barking();
        c.deneme();

        Animal a=c;
        a.eating();
        ((Cat)a).meow();

        //Abstractta her şey geçerli sadece üst sınıfta istediğimiz prototipi oluşturabiliyoruz
        // zaten tüm sınıflarda override edeceğimiz metodun içeriğini doldurma zorunluluğundan kurtuluyoruz. buna karşılık olarak obje üretme yeteğini kaybediyor. işte abstract :))
    }    
}
