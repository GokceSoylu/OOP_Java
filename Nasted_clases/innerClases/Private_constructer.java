package Nasted_clases.innerClases;
public class Private_constructer {}

//*  private constructer oluşturusak buna dışarıdan ulaşamayız getter settar da işe yaramaz çünkü obje oluşturdun nereye atayacaksın
//*  o zamn prşvate constructer demek bu sınıfın nesnesini sadece bu sınıf scabu içinde oluşturup kullanıcam sonra da yok olucak dişarıdan erişm omayacak

//todo Bu kaodda ne yapmak istedim?
//todo bir hasta sınıdfımız var. verilen değerler hastanın tahlili. farklı kurucu sınıflar var çünkü her hasta tahlil yaptırmayablir
//todo yaptırsa dahi her değerden tahlil yaptırmayabilir. bu yüzden girilmeyen değerlere (-1) atadık. 
//todo tahlil(analyses)sınıfınıda private nated yaptık gerektiğinde metod oluşturucak sonra yok olacak. private çünkü 
//todo dişaridan tahlil hesabi yapan sınıfıfa erişm yapılmasını istemiyoruz msadece metodumuz oluştursun
 
class Patient
{
    private String name, story;
    private int age;
    private double diabet, vitaminD, hgb;
    Patient(String name, int age, double hgb, double vitaminD, double diabet)
    {   
        this.name=name;
        this.age=age;
        this.diabet=diabet;
        this.hgb=hgb;
        this.vitaminD=vitaminD;
    }
    Patient(String name, int age, Double hgb, Double vitaminD)
    {
        this(name,age,-1,vitaminD, hgb);
    }
    Patient(String name, int age, Double hgb)
    {
        this(name,age,-1,-1,hgb);
    }
    Patient(String name, int age)
    {
        this(name, age, -1,-1,-1);
    }
    public void set_story(String story)
    {
        this.story=story;
    }
    public void analyses()
    {
        Analyses analys=new Analyses();
        System.out.println();
        System.out.println(name);
        System.out.println("out of refarance values ");
        analys.get_result();
    }
   
    class Analyses
    {
        private void get_result()
        {
            if(!diabet_result())System.out.print("diabet "+diabet);
            if(!vitaminD_result())System.out.println("vitamin D "+vitaminD);
            if(!hgb_result())System.out.println("hgb "+hgb);
        }
        private boolean diabet_result()
        {
            if((diabet<=120 && diabet>=90 )|| diabet==-1.0) return true;
            else return false;
        }
        private boolean vitaminD_result()
        {
            if(vitaminD >= 50 || vitaminD==-1.0) return true;
            else return false;
        }
        private boolean hgb_result()
        {
            if((hgb>=14 && hgb<=18) || hgb==-1.0) return true;
            else return false;
        }
    }
}