package inheritance;

public class MainAnimal 
{
    public static void main(String[] soylu)
    {
        Animal a=new Animal();
        Cat c=new Cat();
        Dog d=new Dog(), d2=new Dog(), d3=new Dog();
        Horse h=new Horse();

        a.eat();
        c.eat();
        d.eat();
        h.eat();
        
        System.out.println();
        System.out.println("upcasting");
        
        //Upcasting
        Animal upcasting=(Animal)c;
        upcasting.eat();
        //! upcasting.meow(); Does not work
        c.meow();
        // evet akıl karıştırıyor farkındayım. Upcasting yaptığında yani üst sınıfa dönüştürdüğünde sadece üst sınıfta prototipi bulunan metodlara ulaşabilirsin
        
        System.out.println();
        System.out.println("Downcasting");

        //Downcastin
        Animal[] array= new Animal[]{d,d2,d3};
        ((Dog)array[0]).barking();
        array[0].eat();
        ((Dog)array[0]).eat();
        
        ((Cat)upcasting).meow(); 

        //nasıl akıllar karıştı dimi :))
        //özetliyorum: Upcasting alt sınıfı bir üst sınıf pointeri ile tutmaktır. 
        //üst sınıf pointerı ile tuttuğumuzda aslında özelliklerini kaybetmez ama pointerın size'ı kısıtlı olduğu için sadece üst sınıfta prototipi
        //buşunan metodlara ulaşılabilir. ovirride metoda ulaşabilme muhabbeti buradan gelir.
        //üst sınıfta protoipi bulunmayan sınıfa ise artık ulaşamıyoruz işte tam bu noktada upcasting devvreye giriyor
        //ismin havalı olduğuna bakma bir şey yapmıyoruz. SAdece başına alt sınıfın adını yazıp ya sen aslında bu sınıftan diyoruz.
        //java ya yaparsın koçum yaparsın diyoruz ve üst sınıfın pointerinin tuttuğu alt sınıf objesi kendine özgü metoda ulaşıyor💃🏻
    }
}
