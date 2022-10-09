package Static2;

public class Static2_test 
{
    public static void main(String[] Soylu)
    {
        Static2_ s1=new Static2_(1,"Sabriye",10);
        Static2_ s2=new Static2_(2,"Zeynep",20);
        Static2_ s3=new Static2_(3,"NEcmiye",30);
        s1.print_info();
        s2.print_info();
        s3.print_info();

        s1.set("MNG");//! AAAA statiği değiştirebiliyoruz. 
                            //? Dikkat etmemiz gereken statşc bir tane olduğu için değiştiğinde tüm objeler için değişir.
        s1.print_info();
        s2.print_info();
        s3.print_info();
    }    
}
