//todo taş kağıt makas yeni yöntemle tekar yazıyoruz :)
package game2;
import java.util.Scanner;
public class RockPapperSicissor2 
{
    public static void main(String[] Soylu)
    {
        Gamer edison=new Gamer("Edison");
        Gamer tesla=new Gamer("Tesla");
        Arena game=new Arena(edison, tesla);
        game.startGame();
    }
}
class Gamer
{
    static int draw=0, trail=0;
    static boolean isGameOver=false;
    int win;
    String name;
    HandSign h;
    Gamer(String name)
    {
        this.name=name;
    }
    public void move()
    {
        Scanner in=new Scanner(System.in);
        System.out.printf("%n%s hamle   ",this.name);
        char choise=in.nextLine().charAt(0);
        switch(this.choise)
        {
            case 'q':
                Arena.isGameOver=true;
                break;
            case 'r':
                h=HandSign.ROCK;
                break;
            case 'p':
                h=HandSign.PAPPER;
                break;
            case 's':
                h=HandSign.SICİSSOR;
                break;
            default:
                System.out.println("wrong choise. It must be s, r or p");
        }
    }
    public static void processMove(Gamer g1, Gamer g2)
    {
        if(g1.h==HandSign.ROCK)
        {
            if(g2.h==HandSign.ROCK) Gamer.draw++;
            else if(g2.h==HandSign.PAPPER) g2.win++;
            else g1.win++;
        }
        else if(g1.h==HandSign.PAPPER)
        {
            if(g2.h==HandSign.ROCK) g1.win++;
            else if(g2.h==HandSign.SICİSSOR) g2.win++;
            else Gamer.draw++;
        }
        else
        {
            if(g2.h==HandSign.SICİSSOR) Gamer.draw++;
            else if(g2.h==HandSign.ROCK) g2.win++;
            else g1.win++;
        }
    }
    static void diplayScors(Gamer g1, Gamer g2)
    {
        (g1.win>g2.win) ? System.out.printf("%s %d%n%s %d%n",g1.name,g1.win,g2.name,g2.win); : System.out.printf("%s %d%n%s %d%n",g2.name,g2.win,g1.name,g1.win);
        System.out.println("esitlik = ",Gamer.draw+"  deneme = ",Gamer.trail);
    }
}
class Arena
{
    int t;
    Gamer g1, g2;
    Arena(Gamer gamer1, Gamer gamer2)
    {
        System.out.printf("%ndeneme hakki = ");
        Scanner in=new Scanner(System.in);
        this.t=in.nextInt();
        this.g1=gamer1;
        this.g2=gamer2;
    }
    void startGame()
    {
        while(!Gamer.isGameOver && Gamer.trail<this.t)
        {
            g1.move();
            g2.move();
            Gamer.processMove(this.g1, this.g2);
            t++;
        }
    }
}
enum HandSign 
{
    ROCK,
    SICİSSOR,
    PAPPER;
}
