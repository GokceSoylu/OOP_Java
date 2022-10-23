package Nasted_clases.LocalClases;
//şimdi hocam biz local class orneklerinin ikisinde de class'i bir metodun içine yazdık. Ancak bu hep metod olmak zorunda değil.
//local class'ın mantığı şu bir scobun içinde geçerli olması bu scob bir metod olabilir, bir döngü olabilir.
public class Selam 
{
    public static void main(String[] Soylu)
    {   
        int i;
        for(i=0;i<3;i++)
        {
            class Hi
            {
                public void turkish()
                {
                    System.out.println("Merhaba");
                }
                public void english()
                {
                    System.out.println("Hello");
                }
                public void spanish()
                {
                    System.out.println("Hola");
                }
            }
            Hi hi=new Hi();
            if(i==0) hi.turkish();
            else if(i==1) hi.english();
            else hi.spanish();
        }
    }    
}
//örnek anlamsız ama döngününde içinde class olabildiğini görme amaçlı yazdık. bu scabun içinde geçelidir scaobda ulaşıklab,lir scaob çalışırken
//çalışır daha sonra yok ollur