package Nasted_clases.innerClases;
//peki iç içe sınıflarda kimse kimsenin metıduna özelliğine erişemiyorsa nedir bu iç içe sınıf oluşturuken nesne alırken bir sğrğ zahmete 
//giriyoruz mantığı ne bunu
//hocam iç içe class'sa iç sınıfın varlığı dış sınıftan bir nesnenin varlığına bağımlıdır. ben sana muhtaaaçç🎶
//mesala örneğimizdeki gibi bir mühendislik fakultesinin varlığı bir universitenşn varlığına bağımlıdır. herhangi bşr uni olmadan
//muh.fak. ta olamaz.
//mesela bir yaprak sınıfı düşünelimm bunun  rengini, yönünü(güneşe dönecek ya), uzuma miktarını kontrol eden metodları olsun.
//ancak bu yaprağın tek başına var olması düşünülemez bir ağaca bağlıdır. o zaman yaprak sınınfı ağaç sınıfının bir alt sınıfı olur. ağaç nesnesi
//yparağın metodlarına özelliklerine erişemez(erişmesinde zatane bu mantıksuız olurdu) yaprak nesneside ağacın özelliklerine metodlarına erişemez.
//ancak yaprak'tan nesne oluşutururken ağaç nesnesi kullanmak zorundayız. ağaçsız yaprak, sensiz ben düşünülemez😁😅
public class University 
{
    
    public String name;
    public class Engineering
    {
        public int code=10;
        public void engine()
        {
            System.out.println("engineering faculity the code "+code);
        }
    }
    private class Education
    {   
        public int code=20;
        public void edu()
        {
            System.out.println("education faculity the code "+code);
        }
    }   
    public void accessEducation()//hiç iimiz yok gibi bir de ulaşmak için fonk yaptık😂
    {
        Education edu=new Education();//neler oluyor
        edu.edu();
    }
    public Education EducationObje()
    {
        Education edu=new Education();
        return edu;
    }
}
