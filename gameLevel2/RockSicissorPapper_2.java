package gameLevel2;
import java.util.*;
public class RockSicissorPapper_2 
{
    public static void main(String[] Soylu)
    {
        Gamer gamer1=new Gamer("Erdogan");
        Gamer gamer2=new Gamer("kilicdaraglu");
        Arena secim=new Arena(gamer1, gamer2);
        secim.startGame();

        Gamer gamer3, gamer4=new Gamer("Bahceli");
        if(gamer1.scor>gamer2.scor)
            gamer3=gamer1;
        else 
            gamer3=gamer2;
        gamer3.scor=0;
        Arena secim2=new Arena(gamer3, gamer4);
        secim2.startGame();

    }
}
class Arena
{
    static int no=0;
    Gamer g1, g2;
    static boolean isGameOver=false;
    int drow, id, trail, counter;
    Arena(Gamer g1, Gamer g2)
    {
        this.g1=g1;
        this.g2=g2;
        this.id=++no;
    }
    void process()
    {
        if(isGameOver);
        else if(g1.handSign==g2.handSign) drow++;
        else if(g1.handSign==HandSign.ROCK && g2.handSign==HandSign.SICESSOR) g1.scor++;
        else if(g1.handSign==HandSign.PAPPER && g2.handSign==HandSign.ROCK) g1.scor++;
        else if(g1.handSign==HandSign.SICESSOR && g2.handSign==HandSign.PAPPER) g1.scor++;
        else g2.scor++;
    }
    void printScors()
    {
        System.out.println("Arena "+id);
        System.out.println(g1.name+" "+g1.scor);
        System.out.println(g2.name+" "+g2.scor);
        System.out.println("drow "+drow);
    }
    void startGame()
    {
        Arena.isGameOver=false;
        Scanner in=new Scanner(System.in);
        System.out.println("trail  ");
        this.trail=in.nextInt();
        while(counter<trail && !isGameOver)
        {
            g1.move();
            g2.move();
            process();
            counter++;
        }
        printScors();
    }
}
class Gamer 
{
    HandSign handSign;
    String name;
    int id, scor;
    static int numberOfGamers=0;
    Gamer(String name)
    {
        this.name=name;
        this.id=++numberOfGamers;
    }
    void move()
    {
        char choise;
        Scanner in=new Scanner(System.in);
        System.out.println(name+" ");
        choise=in.nextLine().charAt(0);
        switch(choise)
        {
            case 'q':
                Arena.isGameOver=true;
                break;
            case 'r':
                handSign=HandSign.ROCK;
                break;
            case 's':
                handSign=HandSign.SICESSOR;
                break;
            case 'p':
                handSign=HandSign.PAPPER;
                break;
            default:
                Arena.isGameOver=true;
                break;
        }
    }
}
enum HandSign
{
    ROCK, 
    SICESSOR,
    PAPPER;
}