package Collection;
import java.util.*;
public class HashSet 
{
    public static void main(String[] Soylu)
    {
        Collection<Integer> set=new HashSet<>();
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        System.out.println("FOR");
        for(int i:set)
            System.out.println(i);
        
        System.out.println("\n"+"iterator");
        Iterator<Integer> itr=set.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());

        System.out.println("\nforeach item");
        set.forEach(item-> System.out.println(item));
    }

//belirli bir sıra takip etemz
//iki tane aynı değerden olmasına izin varmez
}
