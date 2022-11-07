package Game;
import java.util.*;
//todo taş kağıt makas :))
public class RPS 
{
    public static void main(String[] Soylu)
    {
        Gamer lawrance=new Gamer("Lawrance"), herzl=new Gamer("Herzl");
        Game game=new Game(lawrance, herzl);
        game.run();
    }
    
}
class Gamer
{
    int scor;
    static int equal=0;
    char choise;
    String name;
    Gamer(String name)
    {
        this.name=name;
    }
}
class Game
{
    int time;
    Gamer gamer1, gamer2;
    Game(Gamer gamer1, Gamer gamer2)
    {
        this.gamer2=gamer2;
        this.gamer1=gamer1;
    }
    public void choise()
    {
        Scanner in=new Scanner(System.in);
        System.out.printf("%nbirinci oyuncu  ");
        gamer1.choise=in.nextLine().charAt(0);
        System.out.printf("%nikinci oyuncu  ");
        gamer2.choise=in.nextLine().charAt(0);
    }
    public void run()
    {
        int i=0;
        initialize();
        while(i<time)
        {
            choise();
            if(gamer1.choise=='r')
            {
                if(gamer2.choise=='r') Gamer.equal++;
                else if(gamer2.choise=='p') gamer2.scor++;
                else gamer1.scor++;
            }
            else if(gamer1.choise=='p')
            {
                if(gamer2.choise=='r') gamer2.scor++;
                else if(gamer2.choise=='p') Gamer.equal++;
                else gamer1.scor++;
            }
            else
            {
                if(gamer2.choise=='r') gamer2.scor++;
                else if(gamer2.choise=='p') gamer1.scor++;
                else Gamer.equal++;
            }
            i++;
        }
        get_scor();
    }
    public void get_scor()
    {
        System.out.println(gamer1.name+" "+gamer1.scor+"    "+gamer2.name+" "+gamer2.scor+"    esitlik "+Gamer.equal);
    }
    private void initialize()
    {
        Scanner in= new Scanner(System.in);
        gamer1.scor=0;
        gamer2.scor=0;
        System.out.printf("%noyunu kaç el oynamak istersiniz  ");
        time=in.nextInt();
    }
}