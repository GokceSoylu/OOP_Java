package File;
import java.io.*;
import java.util.*;
public class File_ex 
{
    public static void main(String[]Soylu)
    {
        Worker w1=new Worker("serkan",34,9000);
        Worker w2=new Worker("canan",27,10000);
        Worker w3=new Worker("erdi",47,12000);
        ArrayList<Worker> worker_list=new ArrayList<>();
        ArrayList<Worker> Fworker_list=new ArrayList<>();
        worker_list.add(w1);
        worker_list.add(w2);
        worker_list.add(w3);
        try 
        {
            SaveLoadManager.save(worker_list,"worker_list");
        } 
        catch (Exception e) 
        {
            System.out.println("dosya açilamadi");
        }
        try 
        {
            Fworker_list=SaveLoadManager.load("worker_list");
        } 
        catch (Exception e) 
        {
            System.out.println("dosadan okuma yapilamadi");
        }
        for(Worker w:Fworker_list)
            System.out.println(w);
    }    
}
class Worker implements Serializable
{
    String name;
    int age;
    int salary;
    Worker(String name, int age, int salary)
    {
        this.salary=salary;
        this.age=age;
        this.name=name;
    }
    public String toString()
    {
        return name+" "+age+"  "+salary;
    }
}
class SaveLoadManager
{
    public static void save(ArrayList<Worker> list, String file_name) throws Exception
    {
        FileOutputStream file_pointer=new FileOutputStream(file_name);
        ObjectOutputStream object_pointer=new ObjectOutputStream(file_pointer);
        for(Worker w:list)
            object_pointer.writeObject(w);
        object_pointer.close();
    }
    public static ArrayList<Worker> load(String file_name)throws Exception
    {
        FileInputStream file_pointer=new FileInputStream(file_name);
        ObjectInputStream object_pointer=new ObjectInputStream(file_pointer);
        ArrayList<Worker> list=(ArrayList<Worker>)object_pointer.readObject();
        object_pointer.close();
        return list;
    }
}