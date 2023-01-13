package ExamQuestions;
import java.util.*;
public class Book implements Comparable<Book>
{
    double price;
    String name;
    Book(String name,double price)
    {
        this.name=name;
        this.price=price;
    }    
    double totalPrice()
    {
        return price +0.08 * price;
    }

    public int compareTo(Book b)
    {
        return (int)this.price-(int)b.price; 
    }
    
    public String toString()
    {
        return name+" "+totalPrice();
    }
}
class MainBook
{
    public static void main(String[]Soylu)
    {
        Book b1=new Book("kelile ve Dimne",90);
        Book b2=new Book("çali kuşu",56);
        Book b3=new Book("kan ve kum",78);
        Book b4=new Book("umut dükkani",30);
        LinkedList<Book> books=new LinkedList<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        Collections.sort(books);
        Iterator itr=books.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
    }

}
