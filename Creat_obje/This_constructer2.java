package Creat_obje;

public class This_constructer2 
{
    public static void main(String[] Soylu)
    {
        Rectangle r1=new Rectangle(12,3,4,4);
        Rectangle r2=new Rectangle(5,5);
        Rectangle r3=new Rectangle();
        r1.get_circle();
        r2.get_circle();
        r3.get_circle();
        System.out.println();
        
        Rectangle[] R_array={new Rectangle(8,9,6,6), new Rectangle(34,12,3,5), new Rectangle()};
        for(Rectangle each: R_array)
            each.get_circle();
    }
}
class Rectangle//dikdortgen öreneği sizce nereden aldık bu öreneği😅
{
    private int x, y, width, height;
    Rectangle(int x, int y, int width, int heght)
    {
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
    }
    Rectangle()
    {
        this(0,0,1,1);
    }
    Rectangle(int width, int height)
    {
        this(0,0,width,height);
    }
    void get_circle()
    {
        System.out.println(2*(width+height));
    }
}//burada da aslında default değer için kullanıyoruz.
