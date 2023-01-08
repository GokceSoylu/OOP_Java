package List;
import java.util.*;
public class CommonEx 
{
    public static void main(String[] Soylu)
    {
        int i;
        Collection<Integer> ar=new ArrayList<>();
        for(i=0;i<5;i++)
            ar.add(i);        
        
        Collection<Integer> list=new LinkedList<>();
        for(;i<10;i++)
            list.add(i);
        
        Iterator<Integer> itr=ar.iterator();//collection kullanınca ListIterator değil Iterator kullanılır
        while(itr.hasNext())
            System.out.println(itr.next()); 
        Iterator<Integer> itr_list=list.iterator();
        while(itr_list.hasNext())
            System.out.println(itr_list.next());

    }    
}
