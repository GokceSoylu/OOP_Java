package Enum;

public class Teacher //daha komplex yapalım
{
    private int id;
    private Branch b;   
    Teacher(int id, Branch b)
    {
        this.id=id;
        this.b=b;
    } 
    void get_info()
    {
        System.out.printf("id = %d branch = %s%n",id,b);
    }
}
