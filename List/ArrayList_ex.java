package List;

import java.util.*;

public class ArrayList_ex
{
    public static void main(String[] Soylu)
    {
        ArrayList<String> array_list=new ArrayList<String>();
        array_list.add("ankara");
        array_list.add("trabzon");
        array_list.add(2,"manisa");
        for(int i=0;i<array_list.size();i++)
            System.out.println(array_list.get(i));
        array_list.set(0,"elezığ");
        ListIterator<String> itr=array_list.listIterator();
        while(itr.hasNext())
            System.out.println(itr.next());
    }   
//list den farklı olarak indexlerlede çalışabiliyıruz bu sayede set(indext, object) get(index) add(index, object) remove(index, object) metodları bulunur :))
}
