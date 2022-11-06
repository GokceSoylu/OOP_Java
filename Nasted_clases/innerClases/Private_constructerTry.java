package Nasted_clases.innerClases;

public class Private_constructerTry 
{
    public static void main(String[] Soylu)
    {
        Patient p1=new Patient("Hasan",46,18,55,200);
        Patient p2=new Patient("elif",12, 13.0);
        Patient[] p_family={new Patient("murat",48,18,55,119), 
                            new Patient("Behice",45,16,7,115),
                            new Patient("Sabriye",23,18.0),
                            new Patient("Ncmiye",22)};
        p1.analyses();
        p2.analyses();
        for(Patient each:p_family)
            each.analyses();
    }   
}
