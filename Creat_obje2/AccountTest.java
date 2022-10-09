package Creat_obje2;
import java.util.Scanner;
public class AccountTest 
{
    public static void main(String[] Soylu)
    {
        Scanner input=new Scanner(System.in);
        Account a1=new Account("murat",3000.00);
        Account a2=new Account("mehmet dinc",20.9);//! burayı (-) yapınca hata veriyor double olmaduğı için hiç çalışmıyor 
        
        System.out.println("isim "+a1.getName()+ "  balance "+a1.getBalance());
        System.out.println("isim "+a2.getName()+"  balance "+a2.getBalance());

        a1.setName("Abdulhamit");

        System.out.println("please enter deposit amount for a1");
        Double deposit=input.nextDouble();
        a1.deposit(deposit);

        System.out.println("please enter depodit Amount for a2");
        deposit=input.nextDouble();
        a2.deposit(deposit);

        System.out.println("name "+a1.getName()+"  balance "+a1.getBalance());
        System.out.println("name "+a2.getName()+"  balance "+a2.getBalance());

        input.close();
    }    
}
