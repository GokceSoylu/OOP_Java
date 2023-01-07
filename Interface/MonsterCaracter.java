package Interface;

class MainFight
{
    public static void main(String[] Soylu)
    {
        MonsterCaracter monster1=new MonsterCaracter("monster1",1);
        MonsterCaracter monster2=new MonsterCaracter("monster2",2);
        Gollum gollum=new Gollum("gollum", 3);

        Hero hero=new Hero("Hero", 4);
          
        Caracter enemy,enemies[]=new Caracter[]{monster1, monster2, gollum};
        int index=0;
        enemy=enemies[index];
        while(hero.alive && enemy.alive)
        {
            hero.attack(enemy);
            enemy.defence();
            if(enemy instanceof AirAttack)
                ((AirAttack)enemy).airAttack(hero);
            hero.defence();
            if(!enemy.alive && index<enemies.length) enemy=enemies[++index];
        }

    }
}
public class MonsterCaracter extends Caracter implements AirAttack, FireAttack
{
    MonsterCaracter(String name, int id)
    {
        super(name, id);
    }
    void defence()
    {
        if(health<100) health+=10;
        if(health>100) health=100;
    }
    public void airAttack(Caracter other)
    {
        other.takeDamage(20);
        System.out.println(name+"air attacks "+other.health);
    }
    public void fireAttack(Caracter other)
    {
        other.takeDamage(50);
    }
}
class Gollum extends Caracter implements AirAttack
{
    Gollum(String name, int id)
    {
        super(name, id);
    }
    void defence()
    {
        if(health<100) health+=5;
        if(health>100) health=100;
    }
    public void airAttack(Caracter other)
    {
        other.takeDamage(30);
        System.out.println(name+"air attacks "+other.barier);
    }
}
class Hero extends Caracter implements Attack
{
    Hero(String name, int id)
    {
        super(name, id);
        this.health=1000;
    }
    public void attack(Caracter other)
    {
        other.takeDamage(5);
        System.out.println("hero attacks "+other.barier);
    }
    void defence()
    {
        if(health<100) health+=5;
        if(health>100) health=100;
    }
}
interface AirAttack
{
    void airAttack(Caracter other);
}
interface FireAttack
{
    void fireAttack(Caracter other);
}
interface Attack
{
    void attack(Caracter other);
}
abstract class Caracter
{
    String name;
    int id;
    int health;
    int barier;
    boolean alive;
    Caracter(String name, int id)
    {
        this.name=name;
        this.id=id;
        alive=true;
        health=100;
        barier=100;
    }
    void takeDamage(int damage)
    {
        if(barier<0) health-=damage;
        else barier-=damage;
        if(health<=0) alive=false;
    }
    abstract void defence();
}
