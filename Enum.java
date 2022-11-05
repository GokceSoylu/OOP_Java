public class Enum 
{
    enum Day
    {
        mon, tue, wend, thur, fri, sat, sun
    };
    enum Direction
    {
        N, S, W, E
    };
    public static void main(String[] Soylu)
    {
        Day d=Day.mon;
        Direction di=Direction.E;
        System.out.println(d+" "+di);
    }
}
