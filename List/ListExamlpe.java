package List;

import java.util.*;

public class ListExamlpe 
{
    public static void main(String[] Soylu)
    {
        LinkedList<String> list=new LinkedList<String>();
        list.add("kemal");
        list.add("devlet");
        list.add("tayyip");
        list.add("meral");
        
        for(String str:list)
            System.out.println(str);
        
        ListIterator<String> itr=list.listIterator();
        while(itr.hasNext())
            System.out.println(itr.next());
        while(itr.hasPrevious())
            System.out.println(itr.previous());
        
    }    
}
//hasPrevious ve previous özelliklerine sahip olan ListIterator dır. 