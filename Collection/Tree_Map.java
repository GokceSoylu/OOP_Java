package Collection;
import java.util.*;
public class Tree_Map 
{
    public static void main(String[] Soylu)   
    {
        TreeMap<String, Integer> tm=new TreeMap<>();
        tm.put("sabbah",110);
        tm.put("hasan",100);
        tm.put("selcuk",90);
        
        Set set_tm=tm.entrySet();
        Iterator itr=set_tm.iterator();
        while(itr.hasNext())
            System.out.println(itr.next()); 
    }
}
//tree olduğunda sıralam olduğunu  biliyoruz. treemap'te sıramala key'e göre yapışlır. buradaki örnekte strşng'e göre yani

