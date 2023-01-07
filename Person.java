import java.util.*;

public class Person 
{
    int id;
    String firstName;
    String lastName;
    int age; 
}
class User extends Person
{
    String userName;
    String password;

    User(int id, String firstName, String lastName, String userName, String password)
    {
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.userName=userName;
        this.password=password;
    }
}
class Category
{
    int id;
    String categoryCode;
    String categoryName;

    Category(int id, String code, String name)
    {
        this.id=id;
        this.categoryName=name;
        this.categoryCode=code;
    }
}
abstract class Meterial 
{
    int id;
    String name;
    ArrayList<Integer> scores;
    int release_year;
    Category category;
    int price;
    String type;

    Meterial(int id, String name, int release_year, int price, Category category, String type)
    {
        this.id=id;
        this.name=name;
        this.release_year=release_year;
        this.price=price;
        this.category=category;
        this.type=type;
    }
    void addScores(int score)
    {
        scores.add(score);
    }
    double getAvgScore() 
    {
        int sum=0, counter=0;
        Iterator <Integer> itr=scores.iterator();
        while(itr.hasNext())
        {
            sum+=itr.next(); 
            counter++;
        }       
        return (float)sum/counter;
    }
    abstract void getDetail();
}
class Book extends Meterial
{
    Person writer;
    int numberOfPages;

    Book(int id, String name, int release_year, int price, Category category, String type, Person writer, int numberOfPages )
    {
        super(id,name, release_year, price, category,type);
        this.writer=writer;
        this.numberOfPages=numberOfPages;
    }
    void setWriter(Person newWriter)
    {
        this.writer=newWriter;
    }
    void getDetail()
    {
        System.out.println("Writer: "+writer+ "pages: "+numberOfPages);
    }
}
class Movie extends Meterial
{
    ArrayList<Person> actors;
    Person director;

    Movie(int id, String name, int release_year, int price, Category category, String type, ArrayList<Person> actors, String director)
    {
        super(id,name, release_year, price, category,type);
    }
    void addActor(Person actor)
    {
        actors.add(actor);
    }
    @Override
    void getDetail()
    {
        System.out.println("the director"+director);
    }
}
class Netflix 
{
    ArrayList <Meterial> meterials;
    User credential;
    boolean isLogin=false;

    Netflix(ArrayList<Meterial> meterials)
    {
        this.meterials=meterials;
    }
    void login(User user)
    {
        if(user.userName==this.credential.userName && user.password==this.credential.password)
        {
            credential=user;
            isLogin=true;
        }    
    }
    void addMovie(Movie m1)//!
    {
        
    }
    void addBook(Book b1)//!
    {
        login(credential);
        if(isLogin)

    }
    void addMeterial(Meterial m2)
    {
        login(credential);
        if(isLogin)
            meterials.add(m2);
    }
    void N1()
    {
        Iterator<Meterial> itr = meterials.iterator();
        Meterial max_m=itr.next(), new_m;
        while(itr.hasNext())
        {
            new_m=itr.next();
            if(new_m.getAvgScore()>max_m.getAvgScore())
                max_m=new_m;
        }   
        max_m.getDetail();
    }
    void N2()
    {
        Iterator<Meterial> itr = meterials.iterator();
        Meterial min_m=itr.next(), new_m;
        while(itr.hasNext())
        {
            new_m=itr.next();
            if(new_m.getAvgScore()<min_m.getAvgScore())
                min_m=new_m;
        }   
        min_m.getDetail();
    
    }
    void N3(int category_id)
    {

    }
    void N4(int id)
    {

    }
}
