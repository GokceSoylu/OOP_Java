package Nasted_clases.LocalClases;

public class Student 
{
    private String name;
    private int number;
    public int year=2022;
    public Student(String name, String faculity, int order)
    {
        class Number
        {
            int number;
            void createNumber()
            {
                switch(faculity)//ogr num'a once fakulte kodu
                {
                    case ("engineering"):
                        number=10;
                        break;
                    case("education"):
                        number=11;
                        break;
                    case ("medical"):
                        number=12;
                        break;
                }
                int i;
                number*=100;
                number+=yearCode();//sonra kayıt olduğu yılın son iki hanesini ekliyoruz
                number*=1000;
                for(i=0;i<order;i++) number++;//en sonda başarı sırası 
            }
            int yearCode()
            {
                int y, tmp=year;
                y=tmp%10;
                tmp=tmp/10;
                y=y*10+tmp%10;
                return y;
            }
            boolean checkNumber()//ogr number 7 haneli olmalı :))
            {
                if(number<10000000 && number>100000) return true;
                return false;
            }
        }
        this.name=name;
        Number num=new Number();
        num.createNumber();
        if(num.checkNumber())
            this.number=num.number;
    }
    public void print_info()
    {
        System.out.println(name+" "+number);
    }   
}//nasıl örnek ama :))