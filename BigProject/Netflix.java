package BigProject;
import java.util.*;

class Person
{
    int id, age;
    String firstName, lastName;
    Person(String firstName, String lastName, int id, int age)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.id=id;
    }
}
class User extends Person
{
    String userName, password;
    User(String firstName, String lastName, int id,int age, String userName, String password)
    {
        super(firstName, lastName, id, age);
        this.userName=userName;
        this.password=password;
    }
}
class Category 
{
    int id;
    String categoryCode, categoryName;
    Category(int id, String categoryCode, String categoryName)
    {
        this.id=id;
        this.categoryCode=categoryCode;
        this.categoryName=categoryName;
    } 
}
abstract class Meterial
{
    int id, release_year, price;
    Category category;
    ArrayList<Integer> scores;
    String type, name;
    Meterial(int id, String name, ArrayList<Integer> scorers, int release_year, int price, Category category, String type)
    {
        this.id=id;
        this.name=name;
        this.release_year=release_year;
        this.scores=scorers;
        this.price=price;
        this.category=category;
        this.type=type;
    }
    void addScore(int score)
    {
        scores.add(score);
    }
    double getAvgScore()
    {
        int sum=0, counter=0;
        for(int itr:scores)
        {
            sum+=itr;
            counter++;
        }
        return (float)sum/counter;
    }
    void showDetail()
    {
        System.out.println("category: "+category.categoryName+" name: "+name);
    }
} 
class Book extends Meterial
{
    Person writer;
    int numberOfPages;
    Book(int id, String name, ArrayList<Integer> scorers, int release_year, int price, Category category, String type, Person writer, int numberOfPages)
    {
        super(id, name, scorers, release_year, price, category, type);
        this.writer=writer;
        this.numberOfPages=numberOfPages;
    }
    @Override
    void showDetail() {
        super.showDetail();
        System.out.println("yazar: "+writer.firstName+" "+writer.lastName);
    }
}
class Movie extends Meterial
{
    ArrayList<Person> actors;
    Person director;
    Movie(int id, String name, ArrayList<Integer> scorers, int release_year, int price, Category category, String type, ArrayList<Person> actors, Person director)
    {
        super(id, name, scorers, release_year, price, category, type);
        this.actors=actors;
        this.director=director;
    }
    void showDetail()
    {
        super.showDetail();
        System.out.println("filmin türü:"+ type);
    }
}
public class Netflix 
{
    ArrayList<Meterial> meterials;
    User credential;
    boolean isLogin;
    Netflix(ArrayList<Meterial> meterials)
    {
        this.meterials=meterials;
        isLogin=false;
    }
    void login(User user)
    {
        if(user.userName=="N_Soylu" && user.password=="2023_OOp")
        {
            credential=user;
            isLogin=true;
        }
    }
    void addMovie(Movie m1)
    {
        if(isLogin) meterials.add(((Meterial)m1));//todo meterail olmasa??
    }
    void addBook(Book b1)
    {
        if(isLogin) meterials.add(((Meterial)b1));//todo meterail olmasa??
    }
    void addMeterial(Meterial m1)
    {
        if(isLogin) meterials.add(m1);
    }
    void N1()
    {
        double max=(meterials.get(0)).getAvgScore();
        Meterial maxM=meterials.get(0);
        for(Meterial itr:meterials)
        {
            if(max<itr.getAvgScore())
            {
                max=itr.getAvgScore();
                maxM=itr;
            }
        }
        maxM.showDetail();
    }
    void N2()
    {
        Movie m=new Movie(0, null, null, 0, 0, null, null, null, new User(null, null, 0, 0, null, null));
        double min=0;
        for(Meterial itr:meterials) 
            if(itr instanceof Movie)
            {
                min=itr.getAvgScore();
                m=(Movie)itr;
                break;
            } 
        for(Meterial itr:meterials)
            if(itr instanceof Movie)
                if(itr.getAvgScore() < min)
                {
                    min=itr.getAvgScore();
                    m=(Movie)itr;
                }
        m.showDetail();        
    }
    void N3(int categoryId)
    {
        Meterial maxMet=meterials.get(0);
        for(Meterial itr: meterials)
            if(itr.category.id== categoryId)
            {
                maxMet=itr;
                break;
            }
        int max=maxMet.price;
        
        for(Meterial itr:meterials)
            if(itr.category.id==categoryId && itr.price>max)
            {
                max=itr.price;
                maxMet=itr;
            }
        maxMet.showDetail();     
    }
    void N4(int personId)
    {
        for(Meterial itr:meterials)
            if(itr instanceof Movie)
                for(Person p:((Movie)itr).actors)
                    if(p.id==personId)
                        itr.showDetail();

    }
}
class NetflixMain
{
    public static void main(String[] Soylu)
    {
        //1
        Person p1=new Person("hasan","elibol", 1,35);
        Person p2=new Person("Kemal", "Berk",2,24);
        Person p3=new  Person("johny","Deep", 3, 40);
        Person p4=new Person("Leonarda", "Dicaprio",4,45);
        Person p5=new Person("Ozan","Bodur",5,36);
        Person p6=new Person("sultan","elli",6,37);
        Person p7=new Person("franz","kafka",7,56);

        //2
        Category c1=new Category(1,"1","book");
        Category c2=new Category(2,"2","movie");
        
        ArrayList<Integer> score1=new ArrayList<>();
        score1.add(500);
        score1.add(800);
        score1.add(300);

        ArrayList<Integer> score2=new ArrayList<>();
        score2.add(700);
        score2.add(1000);
        score2.add(500);
        
        ArrayList<Person> actors1=new ArrayList<>();
        actors1.add(p2);
        actors1.add(p3);

        ArrayList<Person> actors2=new ArrayList<>();
        actors2.add(p1);
        actors2.add(p3);

        
        
        //3
        Movie m1=new Movie(1,"Zindan adasi",score2,2000,10000,c2,"gizem filmi",actors1,p6);
        Movie m2=new Movie(2,"Eyvah Eyvah",score1,2010,100,c2,"komedi filmi",actors2,p4);

        //4
        Book b1=new Book(3,"operasyon 1915",score2, 2015,400,c1,"tarih kitabi",p5,300);
        Book b2=new Book(4,"dönüşüm",score2,1912,100,c1,"klasik kitap",p7,200);

        //5
        User theUser=new User("Necmiye","Soylu",10,22,"N_Soylu","2023_OOP");
    
        ArrayList<Meterial> met=new ArrayList<>();
        met.add(b1);
        met.add(b2);
        met.add(m1);
        met.add(m2);
        
        //6
        Netflix myNetflix=new Netflix(met);

        //7
        myNetflix.login(theUser);

        //8
        myNetflix.addBook(b1);
        myNetflix.addMovie(m1);

        //9
        myNetflix.N1();
        myNetflix.N2();
        myNetflix.N3(1);
        myNetflix.N4(3);

    }
    
}