package Interface;

public class Printers 
{
    public static void main(String[] Soylu)
    {
        CanonProfessional cp=new CanonProfessional();
        CanonBasic cb=new CanonBasic();
        CanonOffice co=new CanonOffice();

        Printer[] parray=new Printer[]{cp, co, cb};
        for(Printer itr:parray)
            itr.printing();
        Printer[] fax_array=new Printer[]{cp, co};
        for(Printer itr:fax_array)
            ((Fax)itr).faxing(); //Downcasting olayı interface'lerde de var

    }    
}
class CanonProfessional extends Printer 
        implements Fax, Scan, ColorPrint
{
 
    public void faxing()
    {
        System.out.println("pro fax");
    }

    public void scanning()
    {
        System.out.println();
    }

    public void ColorPrinting()
    {
        System.out.println();
    }

    void printing()
    {
        System.out.println("professional printing :))");
    }
}
class CanonOffice extends Printer implements Fax, Scan
{
    public void scanning()
    {

    }
    public void faxing()
    {
        System.out.println("office fax");
    }
}

class CanonBasic extends Printer implements Scan
{
    public void scanning()
    {

    }
}



abstract class Printer
{
    void printing()
    {
        System.out.println("printing...");
    }
}
interface Fax
{
    void faxing();
}
interface Scan
{
    void scanning();
}
interface ColorPrint
{
    void ColorPrinting();
}
// interfacees defoult oolarak public static final olurlar