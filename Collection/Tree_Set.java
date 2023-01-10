package Collection;
import java.util.*;
public class Tree_Set 
{
    public static void main(String[] Soylu)
    {
        TreeSet tree=new TreeSet();
        tree.add("c");
        tree.add("b");
        tree.add("d");

        Iterator itr=tree.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
    }    
}
//sıralar:))