package Creat_obje;
public class refaranceObje 
{
    public static void main(String[] Soylu)
    {
        Dog d1=new Dog();
        Dog d2=new Dog();
        Dog d3=d2;
        d3.age=10;
        d3.color="black";
        System.out.println(d2.color);// göredüğün gibi d2 ve 3 anı nesneyi gösteriyor çünkü hafızadaki aynı yeri gösteriyorlar. bunlar
        //direkt pointer gibi düüşünebilirsin. d1, d2, d3 objeleri gösteriyorlar. bu yüzden d3=d2 dediğimiz zaman aynı nesneyi aynı adresi gözsteririler
        // birind eyapılan değişiklik bu yğzden diğerini etkiler
    }    
}
class Dog
{
    int age;
    String color;
}