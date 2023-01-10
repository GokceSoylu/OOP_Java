package Collection;

import java.util.HashMap;

public class Hash_Map 
{
    public static void main(String[] Soylu)
    {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("kelebek", 10);
        hm.put("aslan",5);
        hm.put("kedi",6);
        hm.put("karinca",40);
        hm.put("kararinca",50);

        System.out.println(hm.entrySet());//yine hash etkisinden dolayı belirikli bir sıra bekleyemeyiz kendisi bir sıra yapar:))

        System.out.println(hm.get("aslan"));
        System.out.println(hm.keySet());
        System.out.println(hm.values());
    }    
}
