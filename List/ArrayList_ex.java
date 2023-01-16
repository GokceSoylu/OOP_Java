package List;

import java.util.*;

public class ArrayList_ex
{
    public static void main(String[] Soylu)
    {
        List<String> array_list=new ArrayList<String>();
        array_list.add("ankara");
        array_list.add("trabzon");
        array_list.add(2,"manisa");
        for(int i=0;i<array_list.size();i++)
            System.out.println(array_list.get(i));
        array_list.set(0,"elezığ");
        ListIterator<String> itr=array_list.listIterator();
        while(itr.hasNext())
            System.out.println(itr.next());
        System.out.println("----\n");
        while(itr.hasPrevious())
            System.out.println(itr.previous());
        for(String s:array_list)
            System.out.println(s);
    }   
//list den farklı olarak indexlerlede çalışabiliyıruz bu sayede set(indext, object) get(index) add(index, object) remove(index, object) metodları bulunur :))
}//array list liked list her ilkisinde de  set get remove fonksiyonları var. arraylist te buna ek olarak index erişimleride var
//b
//hocam buna ek olarak set de değişim yaptığında kadırma olur
//itr olarak iterator for each kullanabilrsin
//nncak dikkat edelim iterator listere ait değil itr ye ait bir fonk
