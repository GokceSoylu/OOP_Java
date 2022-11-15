package gamePC;
import java.util.*;
public class RockSicissorPapper
{
    public static void main(String[] Soylu)
    {
        Gamer gamer1=new Gamer("pc1");
        Gamer gamer2=new Gamer("pc2");
        Area area1=new Area(gamer1, gamer2,5);
        Area area2=new Area();
        System.out.println(area1.id);
        area1.startGame();
        System.out.println();
        System.out.println(area2.id);
        area2.startGame();
    }
}
class Area
{
    static int numberArea;
    Gamer g1,g2;
    int drow, counter, try_, id;
    Area(Gamer g1, Gamer g2, int try_)
    {
        this.g1=g1;
        this.g2=g2;
        this.try_=try_;
        this.id=++numberArea;
    }
    Area()
    {
        Gamer g1=new Gamer();
        Gamer g2=new Gamer();
        this.g1=g1;
        this.g2=g2;
        this.id=++numberArea;
        this.try_=1;
    }
    void processMove()
    {
        if(g1.handSign==g2.handSign) drow++;
        else if(g1.handSign==HandSign.ROCK && g2.handSign==HandSign.SICESSOR) g1.win++;
        else if(g1.handSign==HandSign.PAPPER && g2.handSign==HandSign.ROCK) g1.win++;
        else if(g1.handSign==HandSign.SICESSOR && g2.handSign==HandSign.PAPPER)g2.win++;
        else g2.win++;
    }
    void displayScors()
    {
        System.out.println(g1.name+" "+g1.win);
        System.out.println(g2.name+" "+g2.win);
        System.out.println(drow);
    } 
    void startGame()
    {
        while(try_>counter)
        {
            g1.move();
            g2.move();
            processMove();
            counter++;
        }
        displayScors();
    } 
}
class Gamer
{
    String name;
    HandSign handSign;
    static int counter=0;
    int id, win;
    Gamer(String name)
    {
        this();
        this.name=name;
    }
    Gamer()
    {
        this.name=null;
        this.id=++counter;
    }
    void move()
    {
        Random rand=new Random();
        int choise=rand.nextInt(3);
        if(choise==0) handSign=HandSign.ROCK;
        else if(choise==1)handSign=HandSign.PAPPER;
        else if(choise==2)handSign=HandSign.SICESSOR;
    }
}
enum HandSign
{
    ROCK,
    PAPPER,
    SICESSOR;
}